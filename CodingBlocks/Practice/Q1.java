public class Q1 {
    public static void main(String[] args){
        int n = 5;
        int row = 1;
        while(row <= n){

            int c = 1;
            while(c<=n){
                System.out.print("*");
                c++;
            }
            System.out.println();
            row++;
        }
    }
}
