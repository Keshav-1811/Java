import java.util.*;
public class binToDec {
    public static int btd(int bina){
        int pow=0;
        int dec=0;
        while(bina>0){
            int lastdigit=bina%10;
            dec=dec+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            bina=bina/10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binomial number: ");
        int a=sc.nextInt();
        int b=btd(a);
        System.out.println("Decimal no. of "+ a+" is "+b);
    }

}
