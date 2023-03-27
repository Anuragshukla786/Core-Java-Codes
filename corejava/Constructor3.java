class  Student {
    private String name;
    private int age;

    public Student()//default constructor
    {
        name="rohan";
        age=18;
        System.out.println("This is default constructor");
    }

    public Student(int age)//Single parametrized constructor
    {
        this.age=age;
        name="Anurag";
    }
    public Student(int age,String name)//double parametrized constructor
    {
        this.age=age;
        this.name=name;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }

}
public class Constructor3 {
    public static void main(String[] args) {

        Student s1=new Student();
        s1.disp();

        Student s2=new Student(12);
        s2.disp();

        Student s3=new Student(12,"Anurag");
        s3.disp();

        
    }
    
}
