import java.util.*;
public class create_arr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int arr2[]={2,3,4,5,6,7};
        System.out.println("Enter 5 elements in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr2.length;i++){
            System.err.print(arr2[i]+" ");
        }
        sc.close();
    }
}
