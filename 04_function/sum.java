import java.util.*;
public class sum {
    
    public static int addition(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter seconf number: ");
        int b=sc.nextInt();
        System.out.println("The sum of" + " " + a + " " + "and" +" " + b +" "+ "is"+" " + addition(a,b));
    }
}
