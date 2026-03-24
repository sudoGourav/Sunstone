public class pattern15 {
    public static void main(String[] args) {
        int n = 5;
        int row = 0;
        int space = 0;
        int star = n;
        while(row<n*2-1){
            //space
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
                star--;
                space+=2;
            } else {
                star++;
                space-=2;
            }
        }
    }
}
