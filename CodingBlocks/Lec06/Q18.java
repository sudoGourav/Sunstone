public class Q18 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = n-2;
        int space = 1;
        while(row<=2*n-3){
            //star1
            int i = 1;
            while(i<=star){
                System.out.print("*");
                i++;
            }
            //space
            int j = 1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            //star 2
            int k = 1;
            while(k<=star){
                System.out.print("*");
                k++;
            }

            // nextline
            if(row<n-1){
                space +=2;
                star--;
            }else {
                space -=2;
                star++;
            }
            row++;
            System.out.println();
        }
    }
    
}
