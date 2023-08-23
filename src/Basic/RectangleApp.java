package Basic;

import java.util.*;
class Rectangle
{
	int length,width;
	void setLengthWidth(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	
	void showArea()
	{
		System.out.println("Rectangle"+(length*width));
	}
}
public class RectangleApp 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and width");
		int length=sc.nextInt();
		int width=sc.nextInt();
		Rectangle r=new Rectangle();
		r.setLengthWidth(length, width);
		r.showArea();

	}

}
