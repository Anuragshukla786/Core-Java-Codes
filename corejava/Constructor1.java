class Student{
    private int age;
    private String name;

    public Student(int age, String name)
    {
        this.age=age;
        this.name=name;
    }
    public int getAge()
    {
        return age;

    }
    public String getName()
    {
        return name;
    }
}
public class Constructor1 {
    public static void main(String[] args) {
        Student sc=new Student( 13,"Anurag");
         String name=sc.getName();
         System.out.println(name);

         int age=sc.getAge();
         System.out.println(age);
        
        
    }
    
}
