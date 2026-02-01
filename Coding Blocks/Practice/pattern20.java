public class pattern20 {
    public static void main(String[] args) {
        int n = 7;
        int row = 0;
        int space = n/2;
        int spacein = -1;
        while(row<n){
            //space
            int i = 0;
            while(i<space){
                System.out.print("  ");
                i++;
            }
            //star
            System.out.print("* ");
            //another space
            if(spacein>0){
                int j =0;
                while(j<spacein){
                    System.out.print("  ");
                    j++;
                }
                System.out.print("* ");
            }

            //nextLine
            System.out.println();
            row++;
            if(row<=n/2){
                space--;
                spacein+=2;
            } else {
                space++;
                spacein-=2;
            }

        }
    }
}
