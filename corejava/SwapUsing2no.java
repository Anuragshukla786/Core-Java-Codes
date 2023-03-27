import java.util.Scanner;

public class SwapUsing2no {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");

        int x=sc.nextInt();

        System.out.println("Enter the second number");
        int y=sc.nextInt();

        x=x+y;
        y= x-y;
        x=x-y;
        
        System.out.println(x);
        System.out.println(y);

        sc.close();



    }
    
}
