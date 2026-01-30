package CS;
import java.util.*;
public class TranspositionCipher{
    public static String encrypt(String text, int key){


        int rows = (int)Math.ceil((double) text.length()/key); //rows
        char [][] matrix = new char[rows][key]; //instance

        int index = 0;
        for(int i = 0; i<rows; i++){
            for(int j = 0;j<key; j++){
                if(index<text.length()){
                matrix[i][j]= text.charAt(index++);
            } else {
                matrix[i][j]='x';
            }
            }
        }
        StringBuilder cipher = new StringBuilder();
        for(int j = 0; j<key; j++){
            for(int i = 0; i<rows; i++){
                cipher.append(matrix[i][j]);
            }
        }
        return cipher.toString();
    }

    public static String decrypt(String cipher, int key){
        int rows=(int)Math.ceil((double) cipher.length()/key); //rows
        char [][] matrix = new char[rows][key]; //instance

        int index = 0;
        for(int j = 0; j<key; j++){
            for(int i = 0; i<rows; i++){
                if(index<cipher.length()){
                    matrix[i][j]= cipher.charAt(index++);
                }else matrix[i][j] = 'x';
            }
        }
        StringBuilder text = new StringBuilder();
        for(int j = 0;j<key;j++){
            for(int i = 0;i<rows; i++){
                text.append(matrix[i][j]);
            }
        }
        return text.toString();

    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String text = Sc.nextLine();
        System.out.println("Enter a key: ");
        int key = Sc.nextInt();
        String encrypted = encrypt(text, key);
        String decrypted = decrypt(text, key);
        System.out.println("Encrypted text:" + encrypted);
        System.out.println("Decrypted text:" + decrypted);
        Sc.close();
    }
}
