public class pattern11 {
    public static void main(String[] args) {
        int n = 5;
        int row = 0;
        int star = 1;
        int space = n-1;
        while(row<n){
            //printing space
            int i = 0;
            while(i<space){
                System.out.print(" ");
                i++;
            }
            //printing STAR
            int j = 0;
            while(j<star){
                if(j%2==0)
                    System.out.print("*");
                else System.out.print(" ");
                j++;
            }
            //spaces
            int k = 0;
            while(k<space){
                System.out.print(" ");
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
