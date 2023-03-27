/*This program is using Abstract keyword and Perform the operation
 * on this  program is a polymorphism
 */
abstract class Animal
{
    abstract public void dog();  //this method is abbstract because it
    // is a Without body
    abstract public void eat();
    public void bread()
    {
        System.out.println("All dog are eat the bread");
    }

}
class Puppy extends Animal
{
    public void dog()
    {
        System.out.println("Dog are Barking");
    }
    public void eat()
    {
        System.out.println("Dog eating the food");
    }
}
class BabyPuppy extends Animal
{
    public void dog()
    {
        System.out.println("BabyPuupy are crying");
    }
    public void eat()
    {
        System.out.println("BabyPuppy Drink the Milk ");
    }
}
class Pet 
{
    public void poly(Animal ref)
    {
       ref.dog();
       ref.eat();
       ref.bread();
    }
}
public class Abstraction1 {
    public static void main(String[] args) {
        
        Puppy pp =new Puppy();

        BabyPuppy bb=new BabyPuppy();

        Pet p=new Pet();
        p.poly(pp);
        p.poly(bb);
        
        
    
    
        //     Animal ref=new Puppy();
    //     ref.dog();
    //     ref.eat();
    //     System.out.println("=====================");
    //   Animal  ref2=new BabyPuppy();
    //   ref2.dog();
    //   ref2.eat();
        
    }
    
}
