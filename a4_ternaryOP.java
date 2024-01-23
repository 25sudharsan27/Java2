import java.util.*;

public class a4_ternaryOP {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println((b>a)?((b>c)?b:c):((a>c)?a:c));
    }
}