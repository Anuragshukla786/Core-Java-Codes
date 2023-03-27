class Human
 {
   // private String name;
    int age;
 Human(int a)//constructor it is not inherit
    {
        System.out.println("Human class constructor");
    }
   final void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);

    }
 }
 class Student extends Human
 {
   
        public Student()
        {
            super(18);
        }
    void disp()
    {
        System.out.println("the age is :"+age);
        //System.out.println("the age is"+name);//private property is not inherited
        
    }
    
 }
public class Inheritance1 {
    public static void main(String[] args) {
        Student sc=new Student();
        sc.sleep();
        sc.disp();
        
    }
    
}
