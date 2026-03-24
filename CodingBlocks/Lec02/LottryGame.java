import java.util.Scanner;
public class LottryGame {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        

        System.out.println("Welcome to Lottry Game!");
        System.out.println("Enter a Number to Check your Luck");
        int n = Sc.nextInt();

        if(n>=300 && n<=460)
            System.out.println("the prize is Macbook!");
        else if(n>= 200 && n<=280)
            System.out.println("the prize is Kurkure!");
        else if(n>=1100 && n<=1500)
            System.out.println("the prize is Cycle");
        else if(n>50 && n<=80)
            System.out.println("the prize is Bike");
        else System.out.println("Better Luck Next Time");
        
        Sc.close();
    }
}
