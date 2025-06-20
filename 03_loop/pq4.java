import java.util.*;
public class pq4 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a= sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        System.out.println("The factorial of the number "+a+" is "+fact);
    }
    
}
