import java.util.*;
public class ladder {
    public static void main(String args[]) {
        // Your Code Here
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int row = 0;
        int star = 0;
        int num = 1;
        while(row<n){
            //printing star
            int i = 0;
            while(i<=star){
                System.out.print(num + "\t");
                i++;
                num++;
            }
            //nextLine
            System.out.println();
            row++;
            star++;
        }
        Sc.close();
    }
}
