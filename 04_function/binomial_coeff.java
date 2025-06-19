import java.util.*;
public class binomial_coeff {
    public static long fact(int n){
        long f=1;
        for(int i=1;i<=n;i++){
            f*=(long)i;
        }
        return f;
    }
    public static long bin(int n, int r){
        long a=(long)fact(n);
        long b=(long)fact(r);
        long c=(long)fact(n-r);
        return (long)a/(b*c);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Enter r: ");
        int r=sc.nextInt();
        System.out.println("The binomial coefficient is "+bin(n,r));
        sc.close();
    }
}
