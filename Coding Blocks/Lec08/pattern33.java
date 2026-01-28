public class pattern33 {
    public static void main(String[] args) {
        int n =10;
        int rows =1;
        int space =n-1;
        int star =1;
        int val =n;
        while(rows<=n){
            int i=0;
            while(i<=space){
            System.out.print("  ");
            i++;
        }
        int j =1;
        while(j<=star){
            if(val==n){
                System.out.print("* ");
            }else{
                System.out.print(val+" ");
            }
            if(j<rows){
                val++;
            }else{
                val--;
            }
            j++;
        }
        rows++;
        space--;
        star+=2;
        System.out.println();
    }

    }
}