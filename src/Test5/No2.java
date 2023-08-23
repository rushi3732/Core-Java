package Test5;
import java.util.*;
public class No2 {

	public static void main(String x[])
	{
	Scanner ad=new Scanner(System.in);
	LinkedHashMap <Integer,String>hm=new LinkedHashMap <Integer,String>();
	do {
	System.out.println("case 1 add new element in map store key as number and  value as string");
	System.out.println("cse 2 view all  employee from map collection");
	System.out.println(" case 3 Search All Employee by using its id");
	System.out.println(" case 4 delete All Employee by using its id");
	System.out.println(" enter your choice");
	int no=ad.nextInt();
	switch(no)
	{
	

	case 1: 
		System.out.println("enter key and string");
		int number=ad.nextInt();
		String str=ad.nextLine();		
		hm.put(number,str);
	break;
	case 2:
	Set <Integer> keys= hm.keySet();
	for(Integer key:keys)
	{
		String value=hm.get(key);
		System.out.println(key+"------->"+ value);	
	}
	break;
	case 3:
		System.out.println("");
	
		int id=ad.nextInt();
		Set <Integer> keyss= hm.keySet();
		for(Integer key:keyss)
		{
			String value=hm.get(key);
			System.out.println(key+"------->"+ value);	
		}
		break;

	case 4:
	
		default:
		
			System.out.println("your choice is wrong");	
			break;
		
	}
	}
	while(true);
			
	
	}
	}
