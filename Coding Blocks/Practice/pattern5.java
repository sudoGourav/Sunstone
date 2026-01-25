public class pattern5 {
    public static void main(String[] args){
        int n = 5;
        int row = 0;
        int space = 0;
        int star = n;
        while(row<n){
            //printing SPACES first
            int i = 0;
            while(i<space){
                System.out.print(" ");
                i++;
            }
            //printing STARS now
            int j = 0;
            while(j<star){
                System.out.print("*");
                j++;
            }
            //nextLine
            System.out.println();
            row++;
            space++;
            star--;
        }
    }    
}
