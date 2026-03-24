public class pattern21 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = n*2-3;
        int lstar = n*2-1;
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
            star++;
            space-=2;
        }
        int l= 0;
        while(l<lstar){
            System.out.print("* ");
            l++;
        }

    }
}
