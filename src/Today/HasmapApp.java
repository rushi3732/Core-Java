package Today;
import java.util.*;

import Generic.Interger;
public class HasmapApp {
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		HashMap<Interger,Player>hm= new HashMap <Interger,Player>();
//		Player p=new Player();
		hm.put(1,new Player("Rushi",100));
		hm.put(2, new Player("virat",2000));
		hm.put(3,new Player( "Shreyas",30000));
		hm.put(4,new Player( "Bhuvi",450));
		hm.put(5,new Player( "hardhik",200));
		hm.put("raju", 2000 );
	
		int no=ad.nextInt();
		do {
			switch(no)
			{
			case 1:
				Set keys=hm.keySet();
				Iterator i=keys.iterator();
				while(i.hasNext())
				{
					Object key=i.next();
					Object val=hm.get(key);
					System.out.println(key+"\t"+val);
				}
				break;
				
				
			
			case 2:
			 String Name=ad.next();
			
			
				break;
			case  3:
				break;
			
			case 4:
				break;
				default:
					break;
			}
			
			
		}
		while(true);
		
	}

}
