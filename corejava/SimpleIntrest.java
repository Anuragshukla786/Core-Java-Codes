import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle");
        float p = sc.nextFloat();

        System.out.println("Enter Rate of intrest");
        float r = sc.nextFloat();

        System.out.println("Enter time");
        float t = sc.nextFloat();

        float SimpleIntrest = (p * r * t) / 100;
        System.out.println("Principle :"+ p);
        System.out.println("Rate :" + r);
        System.out.println("Time :"+ r);

        System.out.println("Simpleintrest is: " +SimpleIntrest);

        sc.close();
    }

}
