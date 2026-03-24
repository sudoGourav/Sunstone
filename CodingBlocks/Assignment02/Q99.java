public class Q99{
    public static void main(String[] args){
        int n = 5;
        int row = 0;
        int star = n/2;
        int space = 1;
        while(row<n){
            // for STAR
            int i = 0;
            while(i<star){
                System.out.print("*");
                i++;
            }

            //for Mid SPACE
            int j =0;
            while(j<space){
                if(row==0 || row==n-1)
                    System.out.print("*");
                else System.out.print(" ");
                j++;
            }

            //again STAR
            int k = 0;
            while(k<star){
                System.out.print("*");
                k++;
            }

            //nextLine
            System.out.println();
            row++;
            if(row<n/2){
                space++;
                star--;
            } else {
                space--;
                star++;
            }
        }
    }
}