public class pattern16 {
    public static void main(String[] args) {
        int n = 5;
        int row = 0;
        int space = n-1;
        int star = n;
        while(row<n*2-1){
            //Space
            int i = 0;
            while(i<space){
                System.out.print("  ");
                i++;
            }
            //star
            int j = 0;
            while(j<star){
                System.out.print("* ");
                j++;
            }
            //nextLine
            System.out.println();
            row++;
            if(row<n){
                space--;
                star--;
            } else {
                space++;
                star++;
            }
        }
    }
}
