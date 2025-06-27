import java.util.*;

public class hollow_rhombus {
    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars or spaces (hollow logic)
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line after the whole row is done
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        rhombus(n);
        sc.close();
    }
}
