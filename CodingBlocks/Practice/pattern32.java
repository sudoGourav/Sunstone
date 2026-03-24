public class pattern32 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int vlu = 1;

        

        int row = 0;
        while(row<n*2-1){
            //print
            int i = 0;
            while(i<star){
                if(i%2==0){
                    System.out.print(vlu+" ");
                } else {
                    System.out.print("* ");
                }
                i++;
            }

            //nextLine
            System.out.println();
            row++;
            if(row<n){
                star+=2;
                vlu++;
            } else {
                star-=2;
                vlu--;
            }
        }
    }
}
