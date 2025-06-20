import java.util.*;
public class pq2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int even=0;
        int odd=0;
        for(int i=0;true;i++){
            int a=sc.nextInt();
            if(a%2==0){
                even+=a;
            }else{
                odd+=a;
            }
            if(a==1){
                break;
            }
        }
        System.out.println("Sum of even numbers: "+even);
        System.out.println("Sum of odd numbers: "+odd);
    }
    
}
