
//Q. WAP to create the class name as Area with a two functions function 
//void setRadius(float radius) : this function accept the radius of circle
//void calArea() : this function is used for calculate the area of circle
package Practice;
import java.util.*;
class Area
{    float radius;
	void setRadius(float radius)
	{
		this.radius=radius;
		
	}
	void calArea()
	{
	 float pi=3.14f;
	 float area=pi*radius*radius;
	 System.out.println("Area of circle"+area);	
	}
}
public class AreaApp 
{
	public static void main(String x[])
	{
		
		System.out.println("Enter a  Redius");
		Scanner ad=new Scanner(System.in);
		Area a =new Area();
		float no=ad.nextFloat();
		a.setRadius(no);
		a.calArea();
	}

}

