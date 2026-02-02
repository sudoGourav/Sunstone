public class pattern29 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        int row = 0;
        int space = n-1;
        int star = 1;
        while(row<n){
            //space
            int i = 0;
            while(i<space){
                System.out.print("  ");
                i++;
            }
            //star
            int j = 0;
            while(j<star){
                if(row==0){
                    System.out.print(num +" ");
                } else if(j==0 || j==star-1){
                    System.out.print(num +" ");
                } else {
                    System.out.print("0 ");
                }
                j++;
            }
            //space
            int k = 0;
            while(k<space){
                System.out.print("  ");
                k++;
            }
            //nextLine
            System.out.println();
            row++;
            space--;
            star+=2;
            num++;
        }
    }
}
