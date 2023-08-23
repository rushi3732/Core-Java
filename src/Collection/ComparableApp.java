package Collection;

import java.util.ArrayList;

class Employee implements Comparable
{
	private int id;
	private String name;
	private int sal;
	
	public void SetId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void SetName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void SetSal(int Sal)
	{
		this.sal=sal;
	}
	public int getSal()
	{
		return sal;
	}
	public int compareTo(Object obj)
	{
		 Employee emp=( Employee)obj;
		 if(this.getId()>emp.getId())
		 {
			 return 1;
		 }
		 else if(this.getId()<emp.getId())
		 {
			return -1; 
		 }
		 else {
			 return 0;
		 }
		
		
	}
	
}
public class ComparableApp {
	public static void main(String x[])
	{
		 Employee emp1=new  Employee();
		 Employee emp2 =new  Employee();
		 Employee emp3=new  Employee();
		 emp1.SetId(1);
		 emp1.SetName("rushi");
		 emp1.SetSal(1000);
		
		 emp2.SetId(2);
		 emp2.SetName("sawant");
		 emp3.SetSal(3000);
		
		 emp3.SetId(3);
		 emp3.SetName("Karan");
		 emp3.SetSal(4000);
		 ArrayList al=new ArrayList();
		 al.add(emp1);
		 al.add(emp2);
		 al.add(emp3);
		 System.out.println("Before Sorting");
		 Employee e=new  Employee();
		 System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		
//		 Collections.sort(al);
//		 System.out.println("After sorting");
//		
//		 System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		 
		
	}

}
