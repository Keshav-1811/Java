import java.util.*;
public class decToBin {
    public static int dtb(int dec){
        int pow=0;
        int bin=0;
        while(dec>0){
            int last_digit=dec%2;
            bin=bin+(int)(last_digit*Math.pow(10,pow));
            pow++;
            dec/=2;
        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int a=sc.nextInt();
        int b=dtb(a);
        System.out.println("Binary no. of "+ a+" is "+b);
    }
    
}
