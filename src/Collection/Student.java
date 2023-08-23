package Collection;
import java.util.*;

public class Student {
	public static void main(String x[])
	{
		Vector v= new Vector();
		int choice;
		int count;
do {
	Scanner ad =new Scanner(System.in);
	System.out.println("1:Add New element");
	System.out.println("2:delete the element from vector");
	System.out.println("3:Search Element");
	System.out.println("4:count the Element of vector");
	System.out.println("5:show the all data from vector");
	System.out.println("Enter your choice");
	choice=ad.nextInt();
	
	switch(choice)
	{
	case 1:
		System.out.println("Enter  the value in vector");
		int value=ad.nextInt();
		boolean b=v.add(value);
		if(b)
		{
			System.out.println("Element is Added");
		}
		else
		{
			System.out.println("Element is not Added");
		}
		break;
		
	case 2:
			
		System.out.println("Enter the value for delete");
		value=ad.nextInt();
		int index=v.indexOf(value);
		if(index!=-1)
		{
			v.remove(index);
		
		System.out.println("data deleted from vector");
		
		}
		else
		{
			System.out.println("data not deleted from vector");
		}
		break;
	case 3:
		System.out.println("enter  the element for search");
		value=ad.nextInt();
		b=v.contains(value);
		if(b)
		{
			System.out.println("value found");
		}
		else
		{
			System.out.println("value not found");
		}
		break;
	case 4:
		count=v.size();
		System.out.println("Number element present"+count);
		break;
	case 5:
		for(Object obj:v)
		{
			System.out.println(obj);
			break;
		}
		default:
			System.out.println("wrong choice");	
		}
	}
     while(true);
	}

}
