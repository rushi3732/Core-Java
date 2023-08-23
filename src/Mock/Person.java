package Mock;
import java.util.*;
abstract class PersonApp
{ 
	char name[];
    int mob;
    String adharno;
    int empid;
    char dept[];
    int sal; 
	PersonApp(char name[],int mob, String adharno)
	{
		this.name=name;
		this.mob=mob;
		this.adharno=adharno;
	}
	void display()
	{	
	
			System.out.println(name);	
	
		System.out.println("mob is"+mob);
		System.out.println("adharno is"+adharno);
		
	}
}
	class Employee extends PersonApp
	{
		Employee(int empid,char dept[],int sal ,char name[],int mob, String adharno)
		{ 
		super(name,mob adharno);
		this.empid=empid;
		this.dept=dept;
		this.sal=sal;
//		this.name=name;
//		this.mob=mob;
//		this.adharno=adharno;
		
		}
		void display()
		{
			
		}
	}


public class Person
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in );
		
     System.out.println(" enter  a empid dept sal name  mob adharno");

	    int empid=ad.nextInt();
	    String de;
	    de=ad.next();
	    char dept[];
	    dept=de.toCharArray();
	    int sal=ad.nextInt();
	    String na;
	     na=ad.next();
	     char name[];
	    name=na.toCharArray();
	    int mob;
		mob=ad.nextInt();
	    String adharno=ad.next();
	    
	    Employee e =new Employee(empid,dept,sal,name,mob ,adharno);
	    e.display();
		
	}

}
