import java.util.Scanner;

public class SumOftwo_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int num_1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num_2 = sc.nextInt();
        
        int sum=num_1+num_2;
        System.out.println("Sum of Two number is:"+sum);
        sc.close();
    }
}
