public class pascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int num = 1;
        int count = 0;



        int row = 0;
        while(row<n){
            //print star
            int i = 0;
            while(i<star){

                if(row>1 && i>0 && i<star-1){
                    System.out.print("*");
                    count++;
                } else {
                    System.out.print(num);
                }
                


                i++;
            }
            //nextLine
            System.out.println();
            row++;
            star++;
        }
    }
}
