import java.util.*;
public class patterMagic {
    public static void main (String args[]) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int star = n;
        int space = -1;

        int row = 1;
        while(row<n*2){
            //star
            int i = 0;
            while(i<star){
                System.out.print("*");
                i++;
            }
            //space
            int j = 0;
            while(j<space){
                System.out.print(" ");
                j++;
            }
            //star
            int k = 0;
            while(k<star){
                System.out.print("*");
                k++;
            }
            //nextLine
            System.out.println();
            row++;
            if(row<=n){
                space+=2;
                star--;
            } else{
                space-=2;
                star++;
            }
        }
    }
}