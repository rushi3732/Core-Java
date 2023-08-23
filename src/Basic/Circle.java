package Basic;
import java.util.*;
class circleApp
{
	float redius;
	void setArea(float redius)
	{
	   this.redius=redius;
	}
	void showArea()
	{
		float area=redius*redius*3.14f;
		System.out.println("Area of circle"+area);	
	}
};

public class Circle {
public static void main(String x[])
{

	System.out.println("Enter a  Redius");
	circleApp b=new circleApp();
	Scanner ad=new Scanner(System.in);
	float no=ad.nextFloat();
	b.setArea(no);
	b.showArea();
}
}
