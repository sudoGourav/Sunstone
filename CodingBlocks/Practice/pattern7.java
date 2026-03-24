public class pattern7 {
    public static void main(String[] args){
        int n = 5;
        int row = 1;
        while(row<=n){
            //printing the stars first
            int i = 1;
            while(i<=n){
                if(row==1 || row==n || i==1 || i==n){
                    System.out.print("* ");
                } else System.out.print("  ");
                i++;
            }
            //nextLine
            System.out.println();
            row++;
        }
    }
}
