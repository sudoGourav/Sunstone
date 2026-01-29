public class pattern1 {
    public static void main(String[] args){
        int n = 5;
        int row = 1;
        while(row<=n){
            //printing stars
            int i = 0;
            while(i<=n){
                System.out.print("*");
                i++;
            }
            //nextLine
            System.out.println();
            row++;
        }
    }
}
