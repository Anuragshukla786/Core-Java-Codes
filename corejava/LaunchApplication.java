/*Create a application with the help oops featers */
import java.util.*;

abstract class Shape {
   static float area;

    abstract public void input();

    abstract public void compute();

    public void disp() {
        System.out.println("The area is " + area);
    }
}

class Rectangle extends Shape{
    float length;
    float breadth;

    public void input() {
        System.out.println("Calculation of rectangle app :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of Rectangle");
        length = sc.nextFloat();
        System.out.println("Please enter the breadth of Rectangle");
        breadth = sc.nextFloat();
    }

    public void compute() {
        area = length * breadth;
    }

}

class Square extends Shape{
    float length;

    public void input() {
        System.out.println("Calculation of Square app :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of Square");
        length = sc.nextFloat();

    }

    public void compute() {
        area = length * length;
    }
}

class Circle  extends Shape{
    float radius;

    public void input() {
        System.out.println("Calculation of circle app :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius of Circle");
        radius = sc.nextFloat();
    }

    public void compute() {
        area = 3.14f * radius * radius;
    }

}

class Geometry{
    public void poly(Shape ref)
    {
        ref.input();
        ref.compute();
        ref.disp();
    }
}
public class LaunchApplication {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Square s=new Square();
        Circle c=new Circle();
        Geometry g=new Geometry();
        g.poly(r);
        g.poly(s);
        g.poly(c);
        
    }
    
}
