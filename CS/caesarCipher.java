public class caesarCipher {

    // Encrypt function
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char base;

                // Handle uppercase and lowercase separately
                if (Character.isUpperCase(ch)) {
                    base = 'A';
                } else {
                    base = 'a';
                }

                // Shift character
                char encryptedChar = (char) ((ch - base + shift) % 26 + base);
                result.append(encryptedChar);

            } else {
                // Keep non-letters unchanged
                result.append(ch);
            }
        }

        return result.toString();
    }

    // Decrypt function
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - (shift % 26));
    }

    public static void main(String[] args) {
        String text = "Hello World";
        int shift = 3;

        String encrypted = encrypt(text, shift);
        String decrypted = decrypt(encrypted, shift);

        System.out.println("Original: " + text);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}