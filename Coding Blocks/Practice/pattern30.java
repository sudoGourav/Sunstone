public class pattern30 {
    public static void main(String[] args) {
        int n = 5;
        int v = 5;

        int row = 0;
        while(row<n){

            //print
            int i = 0;
            while(i<n){
                System.out.print(v + " ");
                i++;
                v--;
            }
            v = n;
            //nextLine
            System.out.println();
            row++;
        }
    }
}
