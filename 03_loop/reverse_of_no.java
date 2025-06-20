import java.util.*;
public class reverse_of_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        while(a>0){
            int last= a % 10;
            System.out.print(last);
            a/=10;
        }
    }
}
