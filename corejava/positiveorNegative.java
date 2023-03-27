import java.util.Scanner;
public class positiveorNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x;
        x=sc.nextInt();
        
        System.out.println("Enter the number");
    
    if(x>=0){
      System.out.println("You entered a positive number");
      }
      else{
        System.out.println("Yoy kipped negative number");
        sc.close();

      }
    }
    
}
