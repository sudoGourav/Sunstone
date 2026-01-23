public class Q14 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n;
        int star = 1;
        while(row<=n*2-1){

            
            //spaces
            int i = 1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }

            // stars
            int j= 1;
            while(j<=star){
                System.out.print("*");
                j++;
            }

            //next line
            if(row<n)
                space--;
            else space++;

            row++;
            System.out.println();

        }
    }
}
