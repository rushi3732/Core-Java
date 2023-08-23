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









































//
////Q. WAP to create the program using inheritence 
////
////			Employee 
////
////	FreeLancer	PermenantEmployee	
////here Employee is parent class and with a three files id,name,address 
////and FreeLancer is a child class with a method void setSalary(int nhour,int phcost)
////and calculate the total salary e.g if free lancer number of hour is 10 and per hour cost
////is 100 then total salary is 1000 and in Permenant employee class contain the 
////method name as void inputPackage(int package): this function accept the 
////total annual salary and calculate the monthy salary e.g if employee annual salary
////is 100000 then monthly salary is 10000
//package Practice;
//import java.util.*;
//class Employee
//{
//	int id;
//	String name;
//	String address;
//	void acceptArray(int id,String name,String address)
//	{
//		this.id=id;
//		this.name=name;
//		this.address=address;
//	}
//}
//class  FreeLancer extends Employee
//{
//	int nhour;
//	int phcost;
//	void setSalary(int nhour,int phcost)
//	{
//		this.nhour=nhour;
//		this.phcost=phcost;
//	}
//	void calculate()
//	{
//		System.out.println(id+"\t"+"name"+"\t"+"address");
//		System.out.println(nhour*phcost);
//	}
//	
//}
//class PermenantE extends Employee
//{ 
//	
//	void inputPackage(int  pge)
//	{ 
//		int msalary=pge/12;
//		System.out.println("id name address annual salary and calculate the monthy salary ");
//		System.out.println(id+"\t"+"name"+"\t"+"address");
//		System.out.println(pge+msalary);
//	}
//}
//
//
//public class EmployeeApp 
//{
//	public static void main(String x[])
//	{
//		Scanner ad= new Scanner(System.in);
//		System.out.println("enter a id name address");
//		int id=ad.nextInt();
//		String name=ad.next();
//		String address=ad.next();
//		System.out.println("enter nhour phcost");
//		int nhour=ad.nextInt();
//		int phcost=ad.nextInt();
//		System.out.println("enter  annual salary  ");
//		int pge=ad.nextInt();
//		
//		 FreeLancer f=new  FreeLancer();
//		 PermenantE p=new  PermenantE();
//		 f.acceptArray(id, name, address);
//		 f.setSalary(nhour, phcost);
//		 f.calculate();
//		 p.acceptArray(id, name, address);
//		 p.inputPackage( pge);
//		
//	}
//
//}
