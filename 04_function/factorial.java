import java.util.*;
public class factorial {
    public static long fact(int n){
        long f=1;
        for(int i=1;i<=n;i++){
            f*=(long)i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println("The factorial of "+n+" is "+fact(n));
        sc.close();
    }
}
