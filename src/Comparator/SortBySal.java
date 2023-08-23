package Comparator;
import java.util.*;

import java.util.Comparator;

public class SortBySal implements Comparator {
   
	@Override
	public int compare(Object o1,Object o2)
	{
		Employee emp1=(Employee)o1;
		
		Employee emp2=(Employee)o2;
		if(emp1.getSal()>emp2.getSal())
		{
			return 1;
		}
		else if(emp1.getSal()<emp2.getSal())
		{
			 return -1;
		}
		else {
			return 0;
		}
	}

}
