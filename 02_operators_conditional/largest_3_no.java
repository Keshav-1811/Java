import java.util.*;
public class largest_3_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no.:");
        int a= sc.nextInt();
        System.out.println("Enter second no.:");
        int b= sc.nextInt();
        System.out.println("Enter third no.:");
        int c= sc.nextInt();
        if(a>b && a>c){
            System.out.println(a + " is greatest");
        } else if(b>c){
            System.out.println(b + " is greatest");
        }else {
            System.out.println(c + " is greatest");

        }
    }
}
