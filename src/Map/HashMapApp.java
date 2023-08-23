package Map;
import java.util.*;
public class HashMapApp
{
	public static void main(String x[])
	{
	HashMap <Integer,String>hm=new HashMap <Integer,String>();
	hm.put(1,"Rushikesh");
	hm.put(1,"Rushi");
	hm.put(3,"Sawant");
	hm.put(4,"Akshay");
	hm.put(5,"Rahul");
	hm.put(6,"Karan");
	hm.put(7,"Gautam");
	Set <Integer> keys= hm.keySet();
	for(Integer key:keys)
	{
		String value=hm.get(key);
		System.out.println(key+"------->"+ value);	
	}
	}

}
