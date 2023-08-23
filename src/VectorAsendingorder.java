import java.util.*;
public class VectorAsendingorder
{
	public static void  main(String x[])
	{
		
		Vector v=new Vector();
		v.add(80);
		v.add(20);
		v.add(30);
		v.add(50);
		v.add(60);
		v.add(10);
		v.add(40);
		v.add(70);
		System.out.println("Before Sorting");
		for(Object obj:v) {
			System.out.println(obj);
		}
		for(int i=0;i<v.size();i++)
		{
			for(int j=i+1;j<v.size();j++)
			{
				
				 Object preValue=v.get(i);
			     Object lastValue=v.get(j);
				if((int)preValue>(int)lastValue)
				{
				Object temp=preValue;
				v.set(i, lastValue);
				v.set(j, temp);
				}
		
			}
		}
		System.out.println("After Sorting");
		for(Object obj:v)
		{
			System.out.println(obj);
		}		
	
	}

}
