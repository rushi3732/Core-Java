package Interface;
interface Company
{
	void skillset();
}
class Developer implements Company
{
	public void skillset()
	{
		System.out.println("Good in coding ");
		
	}
}
class Tester implements Company
{
	public void skillset()
	{
		System.out.println("good  in explaning");
		
	}
}

public class InterfaceApp {

	public static void main(String[] args) 
	{
		Company d=new Developer();
		d.skillset();
		Company t=new Tester();
		t.skillset();
	

	}

}
