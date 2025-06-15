import java.util.*;
public class income_tax {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ur salary(in lakhs): ");
        int a= sc.nextInt();
        if(a<=0){
            System.out.println("Invalid");
        }else if(a<=5){
            System.out.println("10 percent tax");
        }else if(a>5 && a<10){
            System.out.println("20 percent tax");
        }else if(a>=10){
            System.out.println("30 percent tax");

        }
    }
}
