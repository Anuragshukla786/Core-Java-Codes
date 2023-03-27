import java.util.Scanner;

public class Calcu_per_marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  hindi=sc.nextInt();
        int  math=sc.nextInt();
        int science=sc.nextInt();
        
    System.out.println("Enter the marks of Robert");
    System.out.println(" In Hindi:"+hindi);
    System.out.println(" In math:"+math);
    System.out.println(" In Science:"+science);
      

     int  total_marks=hindi+math+science;
    System.out.println("Total marks of Robert in all subjects :"+total_marks);

    float percentage=(total_marks/3);
    System.out.println("Percentage of robert & marks"+ percentage);



    sc.close();



    }
    
}
