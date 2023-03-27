class AeroPlane {
    public void takeOff()// this method is Inherited method
    {
        System.out.println("Aeroplane is taking off");
    }

    public void fly()// this method is Inherited method
    {
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane extends AeroPlane {
    public void fly()// This method is Overridding method Because we are Modified in
    // child class After inherited
    {
        System.out.println("cargoplane flying in lower height");
    }
    public void carryGoods()
    {
        System.out.println("CargoPlane carries goods");
    }
}

class PassengerPlane extends AeroPlane {
    public void fly() {
        System.out.println("PassengerPlane fly in a medium height");// This method is
        // overriding method
    }
    public void carryPassengers()
    {
        System.out.println("PassengersPlane carry passengers");
    }
}

public class InheritanceMethod {
    public static void main(String[] args) {
        CargoPlane c = new CargoPlane();
        c.takeOff();
        c.fly();
        c.carryGoods();
       // c.carryPassengers();//it not inherited because it is specialize method
        PassengerPlane p = new PassengerPlane();
        p.takeOff();
        p.fly();
      //  p.carryGoods();//it is specialze method
        p.carryPassengers();


    }

}
