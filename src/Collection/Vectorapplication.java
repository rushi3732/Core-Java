package Collection;
import java.util.*;

import java.util.Vector;

public class Vectorapplication
{
public static void main(String x[])
{
	Vector v=new Vector();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	Iterator i=v.iterator();
	while(i.hasNext())
	{
		Object obj =i.next();
		System.out.println(obj);
	}
	
}

}
