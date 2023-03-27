import java.util.Scanner;

public class check_sq_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int length;
        System.out.println("Length of square");
        length=sc.nextInt();
        int breadth;
        System.out.println("Breadth of square");
        breadth=sc.nextInt();
        if( length == breadth){
            System.out.println("It is Square");

         }
         else {     
            System.out.println("Not square");
            sc.close();

         }   

        }

    }
    

