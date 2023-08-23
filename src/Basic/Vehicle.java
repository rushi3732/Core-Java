package Basic;
import java.util.*;
class VehicleApp
{
	public String  model;
	public int res;
	public int vsp;
	public int fc;
	public int  fuelc;
	
	public VehicleApp(String  model,int res,int vsp,int fc,int fuelc)
	{
		this.model=model;
		this.res=res;
		this.vsp=vsp;
		this.fc=fc;
		this.fuelc=fuelc;
		
	}
}
class  Bus extends VehicleApp
{
	subClass1 ()
	{
		super(100);
		System.out.println("i am child  1 constructor");
	}
}
class  Track extends VehicleApp
{
	subClass2 ()
	{
		super(100);
		System.out.println("i am child 2 constructor");
	}
}

public class Vehicle 
{
	public static void main(String X[])
	{
		
	}

}
