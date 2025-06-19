import java.util.*;
public class product {
    public static int mul(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is "+mul(a,b));
        sc.close();
    }
}
