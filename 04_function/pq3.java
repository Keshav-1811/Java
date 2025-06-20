import java.util.*;
public class pq3 {
    public static int addition(int n){
        int sum=0;
        int last=0;
        while(n>0){
            last=n%10;
            sum+=last;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        System.out.println("The sum of digits of "+n+" is "+addition(n));
    }
}
