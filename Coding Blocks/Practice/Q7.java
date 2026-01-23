public class Q7 {
    public static void main(String[] args){
        int n = 4;   // size of square

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {

                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");

                j++;
            }
            System.out.println();
            i++;
        }
    }


}
