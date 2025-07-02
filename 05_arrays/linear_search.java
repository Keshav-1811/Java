import java.util.*;
public class linear_search {
    public static int ls(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter elements of array:");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the key: ");
    int key=sc.nextInt();
    if(ls(arr,key)==-1){
        System.out.println("Not found....");
    }else{
        System.out.println("At index "+ls(arr,key));
    }
    }
}
