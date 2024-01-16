import java.util.Scanner;

public class a2_input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=sc.nextLine();
        // if you want only character this is the code
        // char b= sc.next().charAt(0);
        double c=sc.nextDouble();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
