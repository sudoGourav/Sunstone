public class pattern31 {
    public static void main(String[] args) {
        int n = 5;
        int v = 5;
        int t = n-1;

        int row = 0;
        while(row<n){

            //print
            int i = 0;
            while(i<n){
                if(i==t){
                    System.out.print("* ");
                } else {
                    System.out.print(v + " ");
                }
                i++;
                v--;
            }
            v = n;
            //nextLine
            System.out.println();
            row++;
            t--;
        }
    }
}
