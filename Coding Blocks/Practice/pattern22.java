public class pattern22 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = n-1;
        int space = 1;
        int lstar = n*2-1;
        int l= 0;
        while(l<lstar){
            System.out.print("* ");
            l++;
        }
        System.out.println();
        while(row<n){
            //stars
            int i=0;
            while(i<star){
                System.out.print("* ");
                i++;
            }
            //space
            int j =0;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            //star
            int k = 0;
            while(k<star){
                System.out.print("* ");
            k++;
            }
            //nextLine
            System.out.println();
            row++;
            star--;
            space+=2;
        }
    }
}
