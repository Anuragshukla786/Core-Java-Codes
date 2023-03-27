class Student{
   private int age;
   private String name;

    public void setAge(int age)
    {
      this.age=age;
       
    }
    public int getAge()
    {
        return age;
    }
    public void setName( String name )
    {
  
       this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void show()
    {
        System.out.println(name+" "+age);
    }
}
public class Encapsulation1 {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student();

        s.setAge(15);
        s1.setAge(14);
        s.setName("Anurag");
        s1.setName("Shukla");
        int stud1Age =s.getAge();
        System.out.println(stud1Age);
        
        
    }
    
}
