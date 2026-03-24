public class pattern8 {
    public static void main(String[] args){
        int n = 5;
        int row = 1;
        int down = n;
        while(row<=n){
            int i = 1;
            while(i<=n){
                if(row==i || (row==i || i==down))
                    System.out.print("* ");
                else System.out.print("  ");
                i++;
            }
            //nextLine
            System.out.println();
            row++;
            down--;
        }
    }
}
