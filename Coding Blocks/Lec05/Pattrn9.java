public class Pattrn9 {
    public static void main(String[] args){
        int n = 5;
        int row = 1;
        
        int spaces = n-1;
        while(row<=n){
            

            // Spaces
            int i = 1;
            while(i<=spaces){
                System.out.print(" ");
                i++;
                spaces--;
            }
            
            // Star
            int j = 1;
            while(j<=spaces){
                System.out.print("*");
                
                j++;

            }
            System.out.println();
            row++;

        }
    }
}
