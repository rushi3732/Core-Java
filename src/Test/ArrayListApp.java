package Test;
import java.util.*;

public class ArrayListApp {

	public static void main(String[] args) {
	ArrayList <Employee>al =new ArrayList<Employee>();
Scanner ad=new Scanner(System.in);
int id=1;
String name="rushi";
int sal=1000;

Employee e1 =new Employee(id,name,sal);
 id=3;
 name="Sawant";
 sal=20000;
 Employee e2 =new Employee(id,name,sal);
 id=2;
 name="Gautam";
 sal=30000;
 Employee e3 =new Employee(id,name,sal);
 al.add(e1);
 al.add(e2);
 al.add(e3);
 System.out.println("Before sorting");
 Iterator i=al.iterator();
		 while(i.hasNext())
		 {
			Employee e=(Employee)i.next();
			 System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		 }
		 System.out.println("After Sort");
		 Collections.sort(al);
		 Iterator a=al.iterator();
		 while(a.hasNext())
		 {
			Employee e=(Employee)a.next();
			 System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		 }


 


	}

}
