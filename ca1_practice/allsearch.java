import java.util.*;

public class allsearch {

    public static void binarysearch(int[] arr,int first,int last,int key){
        int mid=(first+last)/2;
        while(first<=last){
            if(key>arr[mid]){
                first=mid+1;
            }
            else if(key == arr[mid]){
                System.out.print("Element found in the Index: "+mid);
                break;
            }
            else if(key<arr[mid]){
                last=mid-1;
            }
            mid=(first+last)/2;
        }
    }
    public static void LinearSearch(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(key==arr[i]){
                System.out.print("Found at the Index : "+i);
            }
        }

    }
    public static void main(String[] args){

        int[] arr={1,2,3,4,5,6};
        int first=0;
        int last=5;
        int key=3;
        // binarysearch(arr,first,last,key);
        LinearSearch(arr,6,key);        
    }
}
