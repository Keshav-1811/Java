import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("Enter a choice: ");
        int a= sc.nextInt();
        switch(a){
            case 1 : 
            System.out.println("Enter first number: ");
            int b= sc.nextInt();
            System.out.println("Enter second number: ");
            int c= sc.nextInt();
            System.out.println(b+c);
            break;

            case 2 : 
            System.out.println("Enter first number: ");
            int d= sc.nextInt();
            System.out.println("Enter second number: ");
            int e= sc.nextInt();
            System.out.println(d-e);
            break;

            case 3 : 
            System.out.println("Enter first number: ");
            int f= sc.nextInt();
            System.out.println("Enter second number: ");
            int g= sc.nextInt();
            System.out.println(f*g);
            break;

            case 4 : 
            System.out.println("Enter first number: ");
            int h= sc.nextInt();
            System.out.println("Enter second number: ");
            int i= sc.nextInt();
            if(i!=0){
                System.out.println(h/i);
            } else{
                System.out.println("Enter valid number");
            }
            break;

            case 5 : 
            System.out.println("Enter first number: ");
            int j= sc.nextInt();
            System.out.println("Enter second number: ");
            int k= sc.nextInt();
            if(j!=0 && k!=0){
                System.out.println(j%k);
            } else{
                System.out.println("Enter valid number");
            }
            break;
            


        }
    }
}
