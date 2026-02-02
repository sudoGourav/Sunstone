public class pattern34 {
    public static void main(String[] args) {
        int n = 10;
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
                num++;
            }
            //star
            int j = 0;
            while(j<star){
                if(num==10){
                    System.out.print("0 ");
                } else {
                    System.out.print(num +" ");
                }
                if(j<star/2){
                    num++;
                } else {
                    num--;
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
            num = 1;
        }
    }
}
