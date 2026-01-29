public class pattern14 {
    public static void main(String[] args) {
        int n = 5;
        int row = 0;
        int star = 1;
        int space = n-1;
        while(row<n*2-1){
            //spaces
            int i = 0;
            while(i<space){
                System.out.print(" ");
                i++;
            }
            //stars
            int j = 0;
            while(j<star){
                System.out.print("*");
                j++;
            }
            //nextLine
            System.out.println();
            row++;
            if(row<n){
                space--;
                star++;
            } else {
                space++;
                star--;
            }
        }
    }
}
