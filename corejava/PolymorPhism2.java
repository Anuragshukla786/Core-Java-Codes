class AeroPlane1 {
    public void takingOff() 
    {
        System.out.println("Aeroplane is taking off");
    }

    public void fly() 
    {
        System.out.println("Areoplane is flying");
    }
}

class CargoPlane extends AeroPlane1
 {
    public void takingOff() 
    {
        System.out.println("CargoPlane Fly Very high");

    }

    public void fly() 
    {
        System.out.println("Cargoplane Requires Longer Runway");
    }

}

class PassengerPlane extends AeroPlane1 
{
    public void takingOff() 
    {
        System.out.println("PassengerPlane only need  Hundred passenger in a plane");

    }

    public void fly() 
    {
        System.out.println("Passenger plane Require medium size runWay");
    }
}
class FighterPlane extends AeroPlane1
{
    public void takingOff() 
    {
        System.out.println(" FighterPlane Very Fast Fly");

    }

    public void fly() 
    {
        System.out.println(" FighterPlane'S color is a Blue");
    }

}
class Airport
{
    public void poly(AeroPlane1 ref)
{
    
    ref.takingOff();
    ref.fly();
    System.out.println("==============================");
}
}

public class PolymorPhism2 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        
        PassengerPlane pp = new PassengerPlane();

        FighterPlane fp=new FighterPlane();
        Airport a=new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
        // cp.takingOff();
        // cp.fly();

        // pp.takingOff();
        // pp.fly();


        // fp.takingOff();
        // fp.fly();


    }
}
