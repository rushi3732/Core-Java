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
public class Delete
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
		System.out.println("enter id for delet");
		int d=ad.nextInt();
		int i;
		for( i=0;i<e.length-1;i++)	
		{
			if(e[i].getId()==d)
			{
				for(int j=i;j<e.length-1;j++)	
				{
				e[j]=e[j+1];	
			}
			break;
	            }
		}
		System.out.println("After sorting");
	
		for( i=0;i<e.length-1;i++)
		{
			System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSal()+"\n");
	
		}
		}
}
