import java.util.*;
public class pq4 {
    public static boolean pal(int n){
        int pall=0;
        int number=n;
        int last=0;
        while(n>0){
            last=n%10;
            pall=(pall*10)+last;
            n/=10;
        }
        if(pall==number){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        boolean b=pal(n);
        if(b){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
        sc.close();
    }
}
