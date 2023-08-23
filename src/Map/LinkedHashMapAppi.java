package Map;

import java.util.*;
public class LinkedHashMapAppi {
	public static void main(String x[]) {
		LinkedHashMap lm=new LinkedHashMap();
		lm.put(9, "Rushi");
		lm.put(7, "Gautam");
		lm.put(6, "Rahul");
		lm.put(1, "Mahesh");
		lm.put(4, "Nilesh");
		lm.put(3, "Banty");
		lm.put(10, "Karan");
		lm.put(2, "Amit");
		lm.put(5, "Sumit");
		Set keys=lm.keySet();
		Iterator i=keys.iterator();
		while(i.hasNext())
		{
			Object key=i.next();
			Object val=lm.get(key);
			System.out.println(key+"\t"+val);
		}
		}

}
