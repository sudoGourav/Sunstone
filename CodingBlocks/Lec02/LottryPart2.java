import java.util.Scanner;

public class LottryPart2 {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        

        System.out.println("Welcome to Lottry Game!\n");
        System.out.println("Enter a Number to Check your Luck:");
        int n = Sc.nextInt();

        if(n>=300 && n<=460){
            System.out.println("the prize is Macbook!");
            if(n>=300 && n<=380)
                System.out.println("Model: M1 Mac");
            else if(n>=381 && n<=460)
                System.out.println("Model: M1 Mac");
            }

        else if(n>= 200 && n<=280){
            System.out.println("the prize is Kurkure!");
            if(n>=200 && n<=240)
                System.out.println("Flavor: Chilli Kurkure");
            else if(n>=241 && n<=280)
                System.out.println("Flavor: Onion Kurkure");
            }
        
        else if(n>=1100 && n<=1500){
            System.out.println("the prize is Cycle");
            if(n>=1100 && n<= 1300)
                System.out.println("Brand: Avon Cycle");
            else if(n>=1301 && n<=1500)
                System.out.println("Brand: Hero Cycle");
        }
            
        else if(n>50 && n<=80){
            System.out.println("the prize is Bike");

            if(n>50 && n<=65)
                System.out.println("Model: Bullet");
            else if(n>50 && n<=65)
                System.out.println("Model: Rajdoot");
        }


        else System.out.println("Better Luck Next Time");
        
        Sc.close();
    }
}
