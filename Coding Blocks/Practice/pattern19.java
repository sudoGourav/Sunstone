public class pattern19{
    public static void main(String[] args) {
        int n = 7;
        int row = 0;
        int star = n/2;
        int space = 1;

        //first line
        int a = 0;
        while(a<n){
            System.out.print("* ");
            a++;
        }
        System.out.println();
        
        //midd  
        while(row<n-2){
            //star
            int i = 0;
            while(i<star){
                System.out.print("* ");
                i++;
            }
            //space
            int j = 0;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            //star
            int k = 0;
            while(k<star){
                System.out.print("* ");
                k++;
            }
            //nextLine
            System.out.println();
            row++;
            if(row<n/2){
                star--;
                space+=2;
            } else {
                star++;
                space-=2;
            }
        }



        //last line
        int z = 0;
        while(z<n){
            System.out.print("* ");
            z++;
        }
    }
}