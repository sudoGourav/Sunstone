import java.util.Scanner;
public class Vowel {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = Sc.next().charAt(0);
        if(c== 'a' || c == 'e' || c=='i' || c=='o' || c=='u')
            System.out.println("It's Vowel");
        else
            System.out.println("Consonant");
        Sc.close();
    }
}
