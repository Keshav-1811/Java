import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int isPrime = 0;

        if (n <= 1) {
            isPrime = 1;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = 1;
                    break;
                }
            }
        }

        if (isPrime==0) {
            System.out.println(n + " is Prime.");
        } else {
            System.out.println(n + " is Not Prime.");
        }

        sc.close();
    }
}
