import java.util.*;
class  Rectangle
{
    float length;
    float breadth;
    float area;

    public void input()
    {
        System.out.println("Calculation of rectangle app :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the length of Rectangle");
        length=sc.nextFloat();
        System.out.println("Please enter the breadth of Rectangle");
        breadth=sc.nextFloat();
    }
    public void compute()
    {
        area=length*breadth;
    }
    public void disp()
    {
        System.out.println("The area of rectangle is :"+ area);
    }
}
class  Square
{
    float length;
    
    float area;

    public void input()
    {
        System.out.println("Calculation of Square app :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the length of Square");
        length=sc.nextFloat();
   
    }
    public void compute()
    {
        area=length*length;
    }
    public void disp()
    {
        System.out.println("The area of square  is :"+ area);
    }
}
class  Circle
{
    float radius;

    float area;

    public void input()
    {
        System.out.println("Calculation of circle app :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the radius of Circle");
        radius=sc.nextFloat();
        
    }
    public void compute()
    {
        area=3.14f*radius * radius;
    }
    public void disp()
    {
        System.out.println("The are of circle is :"+ area);
    }
}
public class LaunchApp {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.input();
        r.compute();
        r.disp();
        Square s=new Square();
        s.input();
        s.compute();
        s.disp();

        Circle c=new Circle();
        c.input();
        c.compute();
        c.disp();


    }
    
}
