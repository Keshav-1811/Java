
import java.util.*;
public class reverse_a_given_no {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        int rev=0;
        while(a>0){
            int last = a%10;
            rev=(rev*10)+last;
            a/=10;
        }
        System.out.print(rev);
    }
}
