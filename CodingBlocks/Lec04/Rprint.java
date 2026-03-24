
public class Rprint {
    public static void main(String[] args){
    int n = 5;
    int row = 1;
    int star = n;
    
    while(row<=n){
        
        int i=1;
        while(i<=star){

            if(row==1 || row ==n || i==1 || i==n){
                System.out.print("*");
        
            }
            else System.out.print(" ");

            i++;
        }
        row++;
        System.out.println();
    }

    }
}
