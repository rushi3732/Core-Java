package Basic;
import java.util.*;
class Players
{ private int id;
 private String name;
 private int runs;
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
 public void setRuns(int runs)
 { this.runs=runs;
 }
 public int getRuns()
 { return runs;
 }
}
class Team
{
	void addPlayer(Players ...p)
	{
		System.out.println("Id\tName\tRuns");
		for(int i=0;i<p.length;i++)
		{
		System.out.println(	p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getRuns()+"\n");
		}
	}
}


public class Player
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		Players p[]=new Players[3];
		Team t=new Team();
		for(int i=0;i<p.length;i++)
		{
			System.out.println("id name run");
			
			p[i]=new Players();
//			String name=ad.nextLine();
			int id=ad.nextInt();
     		String name=ad.next();//this line work as nextLine
			int run=ad.nextInt();
			ad.nextLine();
			p[i].setId(id);
			p[i].setName(name);
			p[i].setRuns(run);	
	   }
		  t.addPlayer(p);
		  ad.close();
	}

}


