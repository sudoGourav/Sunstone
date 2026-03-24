public class pattern2 {
    public static void main(String[] args){
        int n = 5;
        int row = 1;
        int star = 1;
        while(row<=n){
            //printing stars
            int i=0;
            while(i<star){
                System.out.print("*");
                i++;
            }
            //nextLine
            System.out.println();
            row++;
            star++;
        }
    }
}
