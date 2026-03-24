import java.util.Scanner;
public class Patter{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int row = 0;
        int space = n/2;
        int star = 1;
        if(n%2!=0){
            while(row<n){
                //space
                int i = 0;
                while(i<space){
                    System.out.print(" ");
                    i++;
                }
                //star
                int j = 0;
                while(j<star){
                    System.out.print("*");
                    j++;
                }
                //space
                int k = 0;
                while(k<space){
                    System.out.print(" ");
                    k++;
                }
                //nextLine
                System.out.println();
                row++;
                if(row<=n/2){
                    star+=2;
                    space--;
                } else {
                    star-=2;
                    space++;
                }
            }
        }
        Sc.close();
    }
}