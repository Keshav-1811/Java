import java.util.*;
public class pq2 {
    public static boolean isEven(int a){
        if(a%2==0) return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        System.out.println(isEven(a));
    }
}




