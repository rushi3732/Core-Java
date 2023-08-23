package Test5;
import java.util.*;
class student  implements Comparable
{
	private int id;
private String name;
private int sal;

public 	student(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setPer(int sal) {
		this.sal = sal;
	}
	
	public int compareTo(Object o) {
		if(o>0)
		{
			return 1;
			
		}
		else if(o==0) {
			return 0;
		}
		else {
			return-1;
		}
		
		
		return 0;
	}
	
	
}

public class StudentApp {

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		ArrayList al=new ArrayList();
		student s1 =new student(1,"rushi",100);
		student s2 =new student(2,"Rahul",700);
		student s3=new student(4,"Sanjay",300);
		student s4 =new student(5,"Gautam",400);
		student s5 =new student(6,"karan",500);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
	     
		
		for(Object obj:al) {
			student s=(student)obj;
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getSal());
		  }
		System.out.println("After Sorting");
		Collections.sort(al);
		for(Object obj:al) {
			student s=(student)obj;
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getSal());
		  }
		
	

	}

}
