public class pattern3 {
    public static void main(String[] args){
        int n = 5;
        int row = 0;
        int star = n;
        while(row<n){
            //printing stars
            int i = 0;
            while(i<star){
                System.out.print("*");
                i++;
            }
            System.out.println();
            row++;
            star--;
        }
    }
}
