public class Q3 {
    public static void main(String[] args){
        int n = 5;   // number of rows (you can also take input)

        int i = n;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
