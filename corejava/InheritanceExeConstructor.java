class Demo1 {
    int a;
    int b;

    public Demo1()// constructor
    {
        super();
        System.out.println("Parent class constructor");
    }

    public Demo1(int x, int y) {
        super();
        System.out.println("Parametrized Constructor");
        a = x;
        b = y;
    }
}

class Demo2 extends Demo1 
{
    int m;
    int n;

    public Demo2() {
        this(10, 30);
        System.out.println("Child class Defaul constructor");
    }

    public Demo2(int x, int y) {
        //super()
        System.out.println("Child Class Parametrixed constructor");
        m = x;
        m = y;
    }
}

public class InheritanceExeConstructor {
    public static void main(String[] args) {
        Demo2 d=new Demo2();
       // Demo2 d2=new Demo2(12,23);

    }

}
