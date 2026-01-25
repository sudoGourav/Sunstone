public class pattern7 {
    public static void main(String[] args){
        int n = 5;
        int row = 0;
        while(row<n){
            int i = 0;
            while(i<n){
                if(i==0 || i==n || row==0 || row==n){
                    System.out.print("*");
                } else System.out.print(" ");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
