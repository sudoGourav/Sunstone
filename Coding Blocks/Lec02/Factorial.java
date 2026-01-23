import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        long f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        System.out.println(f);
        Sc.close();
    }
    
}
