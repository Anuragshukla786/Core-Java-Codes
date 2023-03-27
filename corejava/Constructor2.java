class Student
{
    private int a;
    private int b;

      public Student()
      {
        System.out.println("Zero parametrtized constructor");
      }
    public Student(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
public class Constructor2 {
    public static void main(String[] args) {
        Student sc=new Student();
        sc.disp();
        
        Student s2=new Student( 10,20);
       s2.disp();

        
        
    }
    
}
