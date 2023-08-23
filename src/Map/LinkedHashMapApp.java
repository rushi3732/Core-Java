package Map;
import java.util.*;
public class LinkedHashMapApp {
public static void main(String x[])
{
    LinkedHashMap <Integer,Integer> lm=new LinkedHashMap<Integer,Integer>();
	lm.put(1,100);
	lm.put(2,200);
	lm.put(3,300);
	lm.put(4,400);
	lm.put(9,400);
	lm.put(5,500);
	lm.put(6,600);
	Set <Integer> keys=lm.keySet();
	for(Integer key:keys)
	{
		Integer value=lm.get(key);
		System.out.println(key+"----------->"+value);
	}
	
	
	
}
}
