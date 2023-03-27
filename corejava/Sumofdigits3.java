//Calculate Sum of digits of a 3 digit number;
import java.util.*;
public class Sumofdigits3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumofdigits=0;
        while(n>0){
            sumofdigits +=n%10;
            n/=10;

        }
        System.out.println(sumofdigits);
        sc.close();
    }

    
}
