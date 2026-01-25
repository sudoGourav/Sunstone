public class pattern6 {
    public static void main(String[] args){
        int n = 5;
        int row = 0;
        int star = n;
        int space = 0;
        while(row<n){
            //printing SPACES first
            int j = 0;
            while(j<space){
                System.out.print(" ");
                j++;
            }
            //printing STARS now
            int i = 0;
            while(i<star){
                System.out.print("*");
                i++;
            }
            // nextLine
            System.out.println();
            row++;
            star--;
            space +=2;
        }
    }
}
