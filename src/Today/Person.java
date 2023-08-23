package Today;

abstract class PersonApp{
   char name[];
   int mob;
   String  adhar[];
   
	PersonApp(char name[],int mob,String adhar[])
	{
		this.name=name;
		this.mob=mob;
		this.adhar=adhar;
		
	}
	void display()
	{
		System.out.println("Name\t"+name+"\t"+"Mobile \t"+mob+"\t"+"adhar\t"+adhar+"\n");
		
	}
	
	
	class Employee{
		
	}
	
}

public class Person {

	public static void main(String[] args) {
		

	}

}
