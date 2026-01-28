public class pattern33 {
    public static void main(String[] args){
        int n = 10;
        int row = 0;
        int space = n-1;
        int val = n-1;
        int star = 1;
        while(row<n){

            //printing SPACE
            int i = 0;
            while(i<space){
                System.out.print(" ");
                i++;
            }
            //Star
            int j = 0;
            while(j<star){
                if(val==n) System.out.print("0");
                else System.out.print(val);
                if(j<row) val++;
                else val--;

                j++;
            }
            //nextLine
            row++;
            space--;
            star +=2;
            System.out.println();
        }
    }
}
