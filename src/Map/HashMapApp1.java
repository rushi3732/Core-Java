package Map;
import java.util.*;

public class HashMapApp1 {
	public static void main(String x[])
	{
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		hm.put(1,10);
		hm.put(2,20);
		hm.put(3,30);
		hm.put(9,40);
		hm.put(5,50);
		hm.put(4,30);
		hm.put(8,40);
		hm.put(7,50);
		Set <Integer> keys=hm.keySet();
		for(Integer key:keys)
		{
			Integer value=hm.get(key);
			System.out.println(key+"----->"+value);
		}
	}

}
