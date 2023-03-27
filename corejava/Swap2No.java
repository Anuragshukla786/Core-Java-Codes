//Swap two number Wthout using third variable
import java.util.*;
public class Swap2No {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter fisrt variable is :");
        int x=sc.nextInt();
        System.out.println("Enter Second variable");
        int y=sc.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
        System.out.println(y);
        sc.close();
    }
    
    
}
