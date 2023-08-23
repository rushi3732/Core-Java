package Practice;
import java.util.*;
class  Employee
{ int id;
String name;
int salary;
	void setId(int id)
	{
	this.id=id;	
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setSalary(int salary)
	{
	this.salary=salary;	
	}
	int getSalary()
	{
		return salary;
	}
	
}
class Company 
{
	Employee  employee;
	void acceptEmployee(Employee employee)
	{
		this.employee=employee;
	}
	void showEmployee()
	{
		System.out.println("id"+"\t"+" name"+" salary");
		System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSalary());
	}
	
}

public class StudentApp 
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter id name salary");
		Employee s=new Employee();
		Company  c=new Company ();
		int id=ad.nextInt();
		String name=ad.next();
		int salary=ad.nextInt();
		s.setId(id);
		s.setName(name);
		s.setSalary(salary);
		c.acceptEmployee(s);
		c.showEmployee();
		
	}
}