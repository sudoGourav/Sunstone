public class pattern10 {
    public static void main(String[] args) {
        int n = 5;
        int row = 0;
        int star = n*2-1;
        int space = 0;
        while(row<n){
            //printing SPACE
            int i = 0;
            while(i<space){
                System.out.print(" ");
                i++;
            }
            //printing STAR
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
            //next line
            System.out.println();
            row++;
            space++;
            star-=2;
        }
    }
}
