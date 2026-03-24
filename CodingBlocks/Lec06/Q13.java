public class Q13 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        while(row<=(n*2-1)){
            //star
            int i = 1;
            while(i<=star){
                System.out.print("*");
                i++;
            }

            //next line
            System.out.println();
            if(row<n)
                star++;
            else star--;
            row++;
        }
    }
}
