import java.util.*;
public class pq_break {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter number: ");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
        }while(true);
    }
}
