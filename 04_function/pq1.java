import java.util.*;
public class pq1 {
    public static int avg(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number one: ");
        int a=sc.nextInt();
        System.out.println("Enter number two: ");
        int b=sc.nextInt();
        System.out.println("Enter number three: ");
        int c=sc.nextInt();
        System.out.println("Ther average of given numbers is "+avg(a,b,c));
    }
}
