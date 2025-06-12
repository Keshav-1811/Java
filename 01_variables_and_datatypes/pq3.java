import java.util.*;
public class pq3 {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the cost of pencil:");
        float a=sc.nextFloat();
        System.out.println("Enter the cost of pen:");
        float b=sc.nextFloat();
        System.out.println("Enter the cost of: eraser");
        float c=sc.nextFloat();
        System.out.println("After 18 percent gst:");
        System.out.println((a+b+c)+0.18*(a+b+c));
    } 
}
