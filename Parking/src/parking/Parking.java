package parking;
abstract class Vehicle{
   public abstract void park();
}



class Car extends Vehicle{
    @Override
    public void park(){
        System.out.println("Car parked");
    }
    
}
class Van extends Vehicle{
    public void park(){
        System.out.println("Van parked");
    }
    
}
class Bus extends Vehicle{
    @Override
    public void park(){
        System.out.println("Bus parked");
    }
    
}

public class Parking {

    public static void main(String[] args) {
        Vehicle V1 = new Car();
        V1.park();
        Vehicle V2 = new Van();
        V2.park();
       
    }
    
}
