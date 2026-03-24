import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        long sum=0;
        long mul=1;
        
        while(n>0){
            int rem = n%2;
            sum= sum+ rem*mul;
            n=n/2;
            mul = mul*10;

        }
        System.out.println(sum);
        Sc.close();
    }
}
