public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int row = 0;
        int space = n-1;
        int star = 1;
        while(row<n){
            //printing SPACES
            int i = 0;
            while(i<space){
                System.out.print(" ");
                i++;
            }

            //printing STARS
            int j = 0;
            while(j<star){
                System.out.print("*");
                j++;
            }
             int k = 0;
            while(k<space){
                System.out.print(" ");
                k++;
            }

            //nextLine
            System.out.println();
            row++;
            star+=2;
            space--;
        }
    }
}
