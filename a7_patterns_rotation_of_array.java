import java.util.*;


public class a7_patterns_rotation_of_array {
    public static void leftrotation(int arr[]){
        int val=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=val;
    }
    public static void rightrotation(int arr[]){
        int val=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=val;
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rightrotation(arr);
        rightrotation(arr);
        for(int i=0;i<n;i++){
            System.out.println(" "+arr[i]+" ");
        }

    }
}

