package Basic;
interface Vehicles
{
   void engine();
}
class Bike implements Vehicles
{
    public void engine()
    { System.out.println("100 CC");
    }
}
class Car implements Vehicles
{
     public void engine()
     { System.out.println("1000 CC");
     }
}
public class VehicleApps{
    public static void main(String x[])
    {
         Vehicles v = new Bike();
           v.engine();
          v = new Car();
         v.engine();
    }
}

