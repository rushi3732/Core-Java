//
//Q. WAP to create the class name as Rectangle with a two functions 
//void setValues(int len,int wid): this function accept the length and width of rectangle
//void calArea(): this function can calcualte the area of rectangle
package Practice;
import java.util.*;
class Rectangle
{
	int  length,width;
	void setValues(int length,int width)
	{
		this. length= length;
		this.width=width;
		
	}
	void calArea()
	{
		System.out.println("Rectangle is");
	     int Rectangle=length*width;
		System.out.println(Rectangle);
	}
}

public class RectangleApp
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter the length and width");
		int length=ad.nextInt();
		int width=ad.nextInt();
		Rectangle r =new Rectangle();
		r.setValues(length, width);
		r.calArea();
	}
}

