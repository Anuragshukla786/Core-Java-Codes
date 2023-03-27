import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int marks;
       System.out.println("Enter the marks");
       marks=sc.nextInt();
       if(marks>=90){
        System.out.println("Your grade is a");
       }
       else if(marks>80){

        System.out.println("Your grade is b");
       }
       else{
    System.out.println("Enter valid marks");
       }
        sc.close();
    }
    
}
