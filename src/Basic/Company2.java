package Basic;
import java.util.*;
class Emp
{
	 private int id;
	 private String name;
	 private int sal;
	 public void setId(int id)
	 { this.id=id;
	 }
	 public int getId()
	 { return id;
	 }
	 public void setName(String name)
	 { this.name=name;
	 }
	 public String getName()
	 { return name;
	 }
	 public void setSal(int sal)
	 { this.sal=sal;
	 }
	 public int getSal()
	 { return sal;
	 }
}
public class Company2
{
	public static void main(String x[])
	{
	Scanner ad=new Scanner(System.in);
	
	Emp e[] =new Emp[3];
	Emp temp;

	for(int i=0;i<e.length;i++)
	{
		System.out.println("Id name sal");
		e[i]=new Emp();
		int id=ad.nextInt();
		String name=ad.next();
		int sal=ad.nextInt();
		e[i].setId(id);
		e[i].setName(name);
		e[i].setSal(sal);
	}
	System.out.println("Id\tname\t sal\t");
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSal()+"\n");
	
		}
		for(int i=0;i<e.length;i++)
			
		{
			for(int j=i+1;j<e.length;j++)
			{
				if(e[i].getSal()>e[j].getSal())
				{
				     temp=e[i];
				     e[i]=e[j];
				     e[j]=temp;
				}
			}
		}
		System.out.println("After sorting");
		System.out.println("Id\tname\t sal\t");
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSal()+"\n");
	
		}
		}
}
