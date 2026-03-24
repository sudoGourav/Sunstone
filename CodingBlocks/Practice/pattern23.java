public class pattern23 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        int row = 0;
        int space = n-1;
        int star = 1;
        while(row<n){
            //space
            int i = 0;
            while(i<space){
                System.out.print("  ");
                i++;
            }
            //star
            int j = 0;
            while(j<star){
                System.out.print(num +" ");
                j++;
            }
            //space
            int k = 0;
            while(k<space){
                System.out.print("  ");
                k++;
            }
            //nextLine
            System.out.println();
            row++;
            space--;
            star+=2;
        }
    }
}
