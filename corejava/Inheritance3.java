class Demo1
{
    void disp()
    {
        System.out.println("Java is very easy programming language");
    }
}
class Demo2 extends Demo1
{

}
class Demo3 extends Demo2
{

}
public class Inheritance3 {
public static void main(String[] args) {
    Demo3 d=new Demo3();
    d.disp();

    
}    
}
