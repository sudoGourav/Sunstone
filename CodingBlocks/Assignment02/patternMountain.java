public class patternMountain{
    public static void main(String[] args) {
        int n = 4;
        int star = 1;
        int space = n+1;
        int num;
        int row = 1;
        while(row<=n){
            num=1;

            //star
            int i = 0;
            while(i<star){
                System.out.print(num+"\t");
                num++;
                i++;
            }
            int j = 0;
            while(j<space){
                System.out.print("\t");
                j++;
            }
            if(row==n){
                star--;
                num--;
            }
            int k = 0;
            while(k<star){
                num--;
                System.out.print(num+"\t");
                k++;
            }
            //nextLine
            System.out.println();
            row++;
            space -=2;
            star++;
        }
    }
}