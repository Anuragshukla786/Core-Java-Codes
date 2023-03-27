import java.util.Scanner;
public class absolute_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
     if(num<0){
        num=num*-1;

     }   
     System.out.println("The absolute value is"+num);
        
     sc.close();


    }
    
}
