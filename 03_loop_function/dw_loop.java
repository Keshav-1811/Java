import java.util.*;
public class dw_loop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int count=1;
        do{
            System.out.println(count);
            count++;
        } while(count<=n);
    }
}
