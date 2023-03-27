class Student
{
    private Heart h;

    public Student(Heart h)//Constructor and Refrence variable of heart class
    {
        this.h=h;
    }
    public void setH( Heart h)//settter method
    {
        this.h=h;
    }
    public void call()
    {
        h.heartBeater();
    }
}
class Heart
{
 public void heartBeater()
 {
    System.out.println("Heart is important");
 }

}
public class Dependencyinj {
    public static void main(String[] args) {
        
        Heart h=new Heart();
        Student  s=new Student(h);
        s.setH(h);
        
    }
    
}
