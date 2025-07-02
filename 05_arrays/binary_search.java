import java.util.*;
public class binary_search {
    public static int bs(int arr[] , int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key) return mid;
            if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter numbers of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter your key: ");
        int key=sc.nextInt();
        if(bs(arr,key)==-1){
            System.out.println("Not Found....");
        }else{
            System.out.println("At index "+bs(arr,key));
        }
        
    }
}
