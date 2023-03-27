import java.util.Scanner;
public class Countdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int sumofDigits=0;
        int original_n=n;

        while(n>0){
            sumofDigits +=n%10;
            n=n/10;
            sumofDigits++;
        }
         System.out.println("sumber of digits in"+ original_n+"="+sumofDigits);
         sc.close();
        }
    
}
