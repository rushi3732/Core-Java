package Collection;
import java.util.*;

public class VectorContainsApplication 
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		System.out.println("Enter number and check present in collection or not");
		int no=ad.nextInt();
		boolean b=v.contains(no);
		if(b)
		{
			System.out.println("Number is present");
		}
		else
		{
			System.out.println("Number is  not present");
		
		}
	}

}
