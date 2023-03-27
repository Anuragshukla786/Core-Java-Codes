class Aeroplane1 {
    public void takingOff() {
        System.out.println("Aeroplane is taking off");

    }

    public void fly() {
        System.out.println("Areoplane is flying");
    }
}

class CargoPlane extends Aeroplane1 {
    public void takingOff() {
        System.out.println("CargoPlane Fly Very high");

    }

    public void fly() {
        System.out.println("Cargoplane Requires Longer Runway");
    }

}

class PassengerPlane extends Aeroplane1 {
    public void takingOff() {
        System.out.println("PassengerPlane only need  Hundred passenger in a plane");

    }

    public void fly() {
        System.out.println("Passenger plane Require medium size runWay");
    }
}

public class PolymorPhism {
    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        
        PassengerPlane pp = new PassengerPlane();
        
        Aeroplane1 ref;
       // pp=cp;
       ref=cp;
       ref.takingOff();
       ref.fly();
       System.out.println("------------------------------");
       ref=pp;
       ref.takingOff();
       ref.fly();
    }

}
