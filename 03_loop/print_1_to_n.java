import java.util.*;
public class print_1_to_n {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        int a=0;
        while(a<n){
            System.out.println(++a);
        }
    }
}