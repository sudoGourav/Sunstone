public class Pattern8 {
    public static void main(String[] args){
        int n = 5;
        int row = 1;
        while(row<=n){
            int column = 1;
            while(column<=n){
                if(row==column || row+column-1 ==n){
                    System.out.print(" *");
                }
                else System.out.print(" ");
                column++;
            }
            row++;
            System.out.println();
        }
    }
}
