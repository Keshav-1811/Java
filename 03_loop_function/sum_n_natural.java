import java.util.*;
public class sum_n_natural {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        int sum=0;
        int a=0;
        while(a<n){
            sum += ++a;
        }
        System.out.println(sum);
    }
}
