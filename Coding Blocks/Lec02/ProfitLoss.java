import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter Cost Price:");
        int c = Sc.nextInt();

        System.out.println("Enter Selling Price:");
        int s = Sc.nextInt();

        if(s>c)
            System.out.println("Profit of " + (s-c));
        else
            System.out.println("Loss of " + (c-s));
        Sc.close();
    }
}
