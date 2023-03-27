class Calc {
    public int add1(int a, int b) {
        int result = a + b;
        return result;
    }
    public int add2(int a,int b,int c)
    {
        int result=a+b+c;
        return result;
    }
    public double add3(double a, double b)
    {
            double result=a+b;
            return result;
    }

}

public class Demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int result = obj.add1(4, 3);
        int res1=obj.add2(3,3,3);
        double res2=obj.add3(3.1,3.2);
        System.out.println(result);
        System.out.println(res1);
        System.out.println(res2);

    }

}
