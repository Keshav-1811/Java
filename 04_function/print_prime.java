import java.util.*;

public class print_prime {
    public static boolean isPrime(int a) {
        if (a <= 1) return false;
        if (a == 2) return true;

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }

    public static void print(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number range:");
        int n = sc.nextInt();
        print(n);
        sc.close(); 
    }
}
