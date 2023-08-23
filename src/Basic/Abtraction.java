package Basic;
abstract class Employeess
{
   abstract void skillset();

}
class Developer extends Employeess
{
	void skillset()
	{
		System.out.println(" i am expert in coding");
	}
	
}
class Cook extends Employeess
{
	void skillset()
	{
		System.out.println(" i am expert in cooking");
	}
}
class Helper extends Employeess
{
	void skillset()
	{
		System.out.println(" my  Helping neture is good");
	}
}

public class Abtraction {
public static void main(String x[])
{
	Employeess d= new Developer();	
	d.skillset();
	Employeess d1= new Cook();
	d1.skillset();
	Employeess d3= new Helper ();
	d3.skillset();
}
}
