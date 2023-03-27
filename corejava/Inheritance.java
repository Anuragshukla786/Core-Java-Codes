class Animal 
{
    void sleep()
    {
        System.out.println("Animal need sleep");
    }
}
class Tiger extends Animal
{

}
class Monkey extends Animal
{

}
class Deer extends Animal
{

}
public class Inheritance {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.sleep();

        
    }
    
}
