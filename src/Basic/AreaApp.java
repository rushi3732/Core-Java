package Basic;
import java.util.*;
abstract class Area
{
 abstract void showArea();	
}
class Circle01  extends Area
{
	int radius;
	void setRadius(int rad)
	{
		radius=rad;
	}
	void showArea()
	{
		System.out.println("Area of circle is"+"\t"+radius*radius*3.14);
	}
}
class Rectangle01  extends Area
{
	int length,width;
	void setLengthWidth(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	void showArea()
	{
		System.out.println("Area of Rectangle is"+"\t"+2*(length+width));
	}
}

public class AreaApp 
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		 Circle01 c=new  Circle01();
		 Rectangle01 r=new  Rectangle01();
		 System.out.println("Enter a radius");
		 int radius=ad.nextInt();
		 System.out.println("Enter a length And Width");
		 int length=ad.nextInt();
		 int width=ad.nextInt();
		 c.setRadius(radius);
		 c.showArea();
		 r.setLengthWidth(length,width);
		 r.showArea();
	}
}
