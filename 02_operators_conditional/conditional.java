import java.util.*;
public class conditional {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age:");
        int age= sc.nextInt();
        if(age<18){
            System.out.println("Minor");
        } else{
            System.out.println("Eligible");
        }
    }
}
