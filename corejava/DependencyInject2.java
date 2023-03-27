class Car // Target  class
{
    private  Engine eng;

    public Car(Engine eng)
    {
         this.eng=eng;
    }
    public void start()
    {
        eng.engineStart();
    }
//     public void setEngine(Engine eng)
//     {
//         this.eng=eng;
//     }
// }
}

class Engine //DEpendency class
{
     public void  engineStart()
     {
        System.out.println("Car started");
     }
}

class DependencyInject2{
    public static void main(String[] args) {
        Engine e=new Engine();
        Car c=new Car(e);
        c.start();
       // c.setEngine(e);
    }
}
