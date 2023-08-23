package Map;
import java.util.*;
public class TreeMapAppi {
	public static void main(String x[])
	{
		TreeMap t=new TreeMap();
		t.put(1,"Rushi");
		t.put(9,"sawant");
		t.put(5,"sumit");
		t.put(6,"Gautam");
		t.put(3,"Minakshi");
		t.put(8,"Ramdas");
		t.put(2,"Dipak");
		t.put(7,"Karan");
		Set keys=t.keySet();
		Iterator i=keys.iterator();
		while(i.hasNext())
		{
			Object key=i.next();
			Object val=t.get(key);
			System.out.println(key+"\t"+val);
			}
		}

}
