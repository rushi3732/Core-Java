package Test5;
import java.util.*;

//import Basic.Player;
public class PlayerApp {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		Player p1=new Player();
		p1.setId(2);
		p1.setName("rushi");
		p1.setRuns(100);
		
		Player p2=new Player();
		p2.setId(3);
		p2.setName("Akshay");
		p2.setRuns(1000);
		
		Player p3=new Player();
		p3.setId(1);
		p3.setName("Ashish");
		p3.setRuns(2000);
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
		System.out.println("Before Sorting :");
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Player p=(Player)i.next();
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRuns()+"\n");
		}
	
	Collections.sort(al);
	System.out.println("After Sorting :");
	for(Object obj:al)
	{
		Player p=(Player)obj;
		System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRuns()+"\n");
	}
//	System.out.println("Previous:\n");
//	ListIterator i1=al.listIterator(al.size());
//	while(i1.hasPrevious())
//	{
//		Player p=(Player)i1.previous();
//		System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRuns()+"\n");
//	}
//	TreeSet t1=new TreeSet(al);
//	System.out.println("Descending  :\n");
//	NavigableSet n=t1.descendingSet();
//	for(Object obj:n)
//	{
//		Player p=(Player)obj;
//		System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRuns()+"\n");
//	}

	int no=2;
	for(Object obj:al)
	{
		Player p=(Player)obj;
		if(p.getId()==no)
		{
			al.remove(obj);
			break;
		}
	}
	System.out.println("After remove :");
	for(Object obj:al)
	{
		Player p=(Player)obj;
		System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRuns());
	}
	
	System.out.println("After fetching spesific record :");
	int n=1;
	for(Object obj:al)
	{
		Player p=(Player)obj;
		if(p.getId()==n)
		{
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRuns());
			break;
		}
	}
	}
}
