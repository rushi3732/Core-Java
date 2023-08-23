package Mock;
import java.util.*;
class  RectangleApp
{ 
	int length;
    int width;
	RectangleApp()
	{
		length=0;
		width=0;
		System.out.printf("length width variable assigned  zero \t %d %d", length ,width);
		System.out.println("");
		
	}
	RectangleApp(int length,int width)
	{
		this.length=length;
		this.width=width;
		System.out.println("area of rectangle "+(length*width));
		System.out.println("");
		
	}
	RectangleApp( int no)
	{
		length=no;
		width=no;
		System.out.println("area of square "+(length*width));
		System.out.println("");
	}
	
}

public class Rectangle
{
	public static  void main(String x[])
	{
	Scanner ad=new Scanner(System.in);
	System.out.println("enter a  length and width");
	int length=ad.nextInt();
	int width=ad.nextInt();
	System.out.println("enter  a no");
	int no=ad.nextInt();
	RectangleApp r=new RectangleApp();
	RectangleApp r1=new RectangleApp(length,width);
	RectangleApp r2=new RectangleApp(no);
	
	
	}
}
