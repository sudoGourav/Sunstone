public class DToBToD {
    public static void main(String[] args) {
        int n = 39;

        //first decimal to binary
        int bsum = 0;
        int bmul = 1;
        while(n>0){
            int brem = n%2;
            bsum += brem*bmul;
            n= n/2;
            bmul *= 10;
        }
        System.out.println("Binary number is: "+bsum);


        //Last Binary to decimals
        int m = bsum;
        int sum = 0;
        int mul = 1;
        while (m>0) {
            int rem = m%10;
            sum = sum + rem*mul;
            m= m/10;
            mul = mul*2;
        }
        System.out.println("Decimal number is: "+sum);
    }
}
