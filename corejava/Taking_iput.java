import java.util.Scanner;

public class Taking_iput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Name is:" + name);
        
        // System.out.println("Enter Your lucy number:");
        // int num_1 = sc.nextInt();
        // System.out.println("Lucky number is:" + num_1);
        sc.close();
    }
}
