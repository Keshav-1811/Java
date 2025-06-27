import java.util.*;
public class number_inverted_half_pyramid {
    public static void nihp(int n){
        for(int i=1;i<=n;i++){
            int count=1;
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" "+count++);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        nihp(n);
    }
}
