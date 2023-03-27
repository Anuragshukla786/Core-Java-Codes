import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        System.out.println((x+8)/3%2*5);

        sc.close();
    }
    
}
