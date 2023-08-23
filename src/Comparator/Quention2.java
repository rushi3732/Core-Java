package Comparator;
import java.util.*;
public class Quention2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Scanner ad=new Scanner(System.in);
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setName("Rushi");
		emp1.setSal(50000);
		Employee emp2=new Employee();
		emp2.setId(2);
		emp2.setName("Akshay");
		emp2.setSal(40000);
		Employee emp3=new Employee();
		emp3.setId(3);
		emp3.setName("Priya");
		emp3.setSal(30000);
		Employee emp4=new Employee();
		emp4.setId(4);
		emp4.setName("Mahi");
		emp4.setSal(25000);
		Employee emp5=new Employee();
		emp5.setId(5);
		emp5.setName("Nilesh");
		emp5.setSal(20000);
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);
		System.out.println("Showa all record Present in Array");	
	for(Object obj:al)
	{
		Employee e=(Employee)obj;
		System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal()+"\n");
	}
	
	SortBySal s=new SortBySal();
	Collections.sort(al,s);
	
	System.out.println("After sort\n");
	
	for(Object obj:al)
	{
		Employee e=(Employee)obj;
		System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal()+"\n");
	}
		
	}

}
