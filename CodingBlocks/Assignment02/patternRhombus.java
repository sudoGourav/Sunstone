public class patternRhombus{
    public static void main(String[] args){
        int n = 3;
        int space = n-1;
        int star = 1;
        int num = 1;
        int jnum = num;
        

        int row = 0;
        while(row<n*2-1){
            //space
            int i = 0;
            while(i<space){
                System.out.print("\t");
                i++;
            }
            //star
            int j = 0;
            while(j<star){
                
                System.out.print(num+"\t");
                if(j<row){
                    num++;
                } else {
                    num--;
                }
                j++;
            }
            //space last
            int k = 0;
            while(k<space){
                System.out.print("\t");
                k++;
            }
            //nextLine
             row++;
            System.out.println();

            if(row<n){
                space--;
                star+=2;
            } else{
                space++;
                star-=2;
            }
        }
    }
}