package Test;
import java.util.*;
class StudentApplication
{
	private int id;
	private String name;
	private int run;
	public StudentApplication(int id, String name, int run) {
		super();
		this.id = id;
		this.name = name;
		this.run = run;
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
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
}

public class StudentApp {
	public static void main(String x[])
	{ 
		Scanner ad=new Scanner(System.in);
		
		ArrayList al=new ArrayList();
		do {
			
		
		System.out.println(" 1: Add new object in collection");
		System.out.println("2:view all object in collection");
		System.out.println("3: remove object from collection using particular feild as id");
		System.out.println("4:search object from collection using paticular feild like  as id ");
		int choice=ad.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter a  id name  run");
			int id=ad.nextInt();
			String name=ad.next();
			int run=ad.nextInt();
			
				boolean b=al.add(id);
			      al.add(name);
				  al.add(run);
				
				if(b)
				{
					System.out.println("Object is Added");
				}
				else
				{
					System.out.println("Element is not Added");
				}
			
		break;
		case 2:
			System.out.println("Enter number and check present in collection or not");
			int no=ad.nextInt();
			 b=al.contains(no);
			if(b)
			{
				System.out.println("Number is present");
			}
			else
			{
				System.out.println("Number is  not present");
			
			}
			break;
		case 3:
			 System.out.println("Delete the value in collection");
			 int n=ad.nextInt();
			 int index=al.indexOf(n);
			 if(index!=-1)
			 {
				 al.remove(index);
				 System.out.println("Number is deleted in collection");
			 }
			 else
			 {
				 System.out.println("Number is not  deleted in collection"); 
			 }
			 
			break;
		case 4:
			int num=ad.nextInt();
			boolean c=al.contains(num);
			if(c)
			{
				System.out.println(" object  is present");
			}
			else
			{
				System.out.println("Number is  not present");
			
			}
		default:
		}
		}
		while(true);
		
	     
	}

}
