import java.util.*;
public class hollow_rectangle {
    public static void holrect(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lenght:");
        int a=sc.nextInt();
        System.out.println("Enter breadth:");
        int b=sc.nextInt();
        holrect(a,b);
    }
}
