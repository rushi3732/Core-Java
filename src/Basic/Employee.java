package Basic;
import java.util.*;
class EmployeeApp
{	
	String name;
	int id;
	int basicSal;
	int increSal;
	void setPersonalInfo(String name,int id,int basicSal )
	{
	this.name=name;
	this.id=id;
	this.basicSal=basicSal;
	}
	void setProgressPer(int progress)
	{
		if(progress>60)
		{
		increSal=basicSal*30/100;
		}
	}
	void show()
	{
		System.out.println("Id \t"+id+"\t"+"Name\t"+name+"\t"+"BasicSal\t"+basicSal+"\t"+"IncreSal\t"+increSal+"\t"+"TotalSal\t"+(basicSal+increSal));
	}
};

public class Employee
{
	public static void main(String x[])
	{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter name  id basicSal");
				String name=sc.nextLine();
				int id=sc.nextInt();
			   int basicSal=sc.nextInt();
			   System.out.println("enter Progress value");
			   int progress=sc.nextInt();
			   EmployeeApp e=new EmployeeApp();
			  e.setPersonalInfo(name,id , basicSal);
			  e.setProgressPer(progress);
			  e.show();		
	}

}
