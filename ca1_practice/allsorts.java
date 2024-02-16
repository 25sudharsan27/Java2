import java.util.*;

public class allsorts{
    public static void pri(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]+" ");
        }
    }
    public static void bubblesort(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void insertionsort(int[] arr,int n){
        int i,key,j;
        
        for(i=1;i<n;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void selectionsort(int[] arr,int n){

        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args){
        int n=5;
        int[] arr={2,1231,11,32,41};
        selectionsort(arr,n);
        pri(arr,n);

    }
}