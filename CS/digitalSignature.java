package CS;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;

public class digitalSignature {
    public static void main(String[] args) throws Exception {

        // message to sign
        String message = "Hello World";

        // generate keypair
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA");
        keyGen.initialize(2048);
        KeyPair pair = keyGen.generateKeyPair();

        PrivateKey privateKey = pair.getPrivate();
        PublicKey publicKey = pair.getPublic();

        // create signature object
        Signature sign = Signature.getInstance("SHA256withDSA");

        // initialize with private key
        sign.initSign(privateKey);

        // add data
        sign.update(message.getBytes());

        // generate signature
        byte[] signatureBytes = sign.sign();
        System.out.println("Signature generated");

        // verify
        Signature verify = Signature.getInstance("SHA256withDSA");

        // initialize with public key
        verify.initVerify(publicKey);
        verify.update(message.getBytes());

        boolean isValid = verify.verify(signatureBytes);
        System.out.println("Signature valid: " + isValid);
    }
}