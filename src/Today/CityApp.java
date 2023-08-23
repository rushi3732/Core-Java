package Today;
import java.util.*;

public class CityApp {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		City c1=new City("Pune",100000);
		City c2=new City("Nagar",10000);
		City c3=new City("Mumbai",200000);
		al.add(c1);
		al.add(c2);
		al.add(c3); 
		System.out.println("before Descending \n");
		for(Object obj:al)
		{
			City c=(City)obj;
			System.out.println("CityName \t"+c.getCity_Name()+"\t"+"Population\t"+c.getPopulation());
		}
		Collections.sort(al);
		System.out.println("After Descending\n ");
	
		ListIterator li=al.listIterator(al.size());
		while(li.hasPrevious())
		{
			City c=(City)li.previous();
			System.out.println("CityName \t"+c.getCity_Name()+"\t"+"Population\t"+c.getPopulation());
		}
		}

}
