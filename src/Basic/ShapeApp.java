package Basic;
import java.util.*;
abstract class Shape
{
abstract void area(int radius);
abstract void area(int length,int width);
}
class AdpShape extends Shape
{
void area(int radius)
{

}
void area(int length,int width)
{
}
}
class Circles extends  AdpShape
{
void area(int radius)
{
	System.out.println("Area of circle is");
	float result=3.14f*radius*radius;
	System.out.println(result);
}
}
class Squre extends  AdpShape
{
void area(int length,int width)
{
	System.out.println("Area of  retangale is");
	int result= length*width;
	System.out.println(result);
}
}

public class ShapeApp {
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println(" Enter a redius");
		int radius=ad.nextInt();
		System.out.println(" Enter a length width");
		int length=ad.nextInt();
		int width=ad.nextInt();
		Circles c=new  Circles();
		 c.area(radius);
		 Squre s= new Squre();
		 s.area(length, width);
		
		
	}

}
