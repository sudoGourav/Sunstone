import java.util.*;
public class r4pattern {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int star = 1;
        int row = 0;
        while(row<n){
            //print star
            int i = 0;
            while(i<star){
                System.out.print("*");
                i++;
            }
            //nextLine
            System.out.println();
            row++;
            star++;
        }
        Sc.close();
    }
}