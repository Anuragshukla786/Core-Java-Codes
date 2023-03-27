import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op;
        double num1;
        double num2;
        double ans;
        System.out.println("Enter an operator:(+, -,*,/,)");
        op = sc.next().charAt(0);
        System.out.println("Enter first number:");
        num1 = sc.nextDouble();
        System.out.println("Enter Second Number");

        num2 = sc.nextDouble();

        switch (op) {

            case '+':
                ans = num1 + num2;
                System.out.println(num1 + " + " + num2 + "=" + ans);
                break;
            case '-':
                ans = num1 - num2;
                System.out.println(num1 + " - " + num2 + "=" + ans);
                break;
            case '*':
                ans = num1 * num2;
                System.out.println(num1 + " * " + num2 + "=" + ans);
                break;
            case '/':
                ans = num1 / num2;
                System.out.println(num1 + " / " + num2 + "=" + ans);
                break;
            default:
                System.out.println("Error ! The operator is not correct");
                break;

        }
        sc.close();

    }

}
