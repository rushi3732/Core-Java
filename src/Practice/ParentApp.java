//
//Q. WAP to create the class name as Parent with constructor and accept the 
//single parameter of type integer and create the class name as Child with 
//single parameter of type integer and pass the value from child constructor to parent constructor

package Practice;
class Parent
{
Parent(int x)
{
	System.out.println("number is"+x);
}
}
class Child extends Parent
{
	Child(int x)
	{
		super(x);
	}
	
}

public class ParentApp 
{
	public static void main(String x[])
			{
		     Child c=new Child(10);
			}

}
