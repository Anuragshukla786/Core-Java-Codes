//W.A.P   to add 8 to the no x and then devide it by 3. now the modulus of the Quotient is taken
// with 5 and then multiply the resultant by 5. display the final result
import java.util.*;
public class main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println((((x+8)/3)%5)*5);
        sc.close();

    }
    
}
