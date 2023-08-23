package Map;
import java.util.*;

public class HashMapAppi {
	public  static void main(String x[])
	{
		
		
	HashMap hm=new HashMap();
	hm.put(2, "Rushi");
	hm.put(25, "Banty");
	hm.put(40, "karan");
	hm.put(7, "Rahul");
	hm.put(8, "sumit");
	hm.put(100, "Amit");
	hm.put(6, "karan");
	hm.put(9, "Gautam");
	Set keys=hm.keySet();
	Iterator i=keys.iterator();
	while(i.hasNext())
	{
		Object key=i.next();
		Object val=hm.get(key);
		System.out.println(key+"\t"+val);
	}
	
	}

}
