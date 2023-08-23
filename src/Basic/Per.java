package Basic;
import java.util.*;
class perApp
{  int per,agg;
   String name;
   int id;
   String address;
   String Year;
	void calper(int s[])
	{
		for(int i=0;i<s.length;i++)
		{
			agg=agg+s[i];
		}
		per=agg/s.length;
	}
}
class CSE extends perApp
{
	CSE(String name,int id,String address,String Year)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.Year=Year;
	}
		void showCsePer()
		{  
			System.out.println("CSE Student percentage");
			System.out.println("name"+"\t"+name+"\t"+"id"+"\t"+id+"\t"+"address"+"\t"+address+"\t"+"year"+"\t"+Year+"\n");
			System.out.println("Percentage is a ="+per);
		}	
}
class ETC extends perApp
{
	ETC(String name,int id,String address,String Year)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.Year=Year;
	}
		void showCsePer()
		{ 
            System.out.println("ETC Student percentage\n");
			System.out.println("name"+"\t"+name+"\t"+"id"+"\t"+id+"\t"+"address"+"\t"+address+"\t"+"year"+"\t"+Year+"\n");
			System.out.println("Percentage is a ="+per);
		}	
}
public class Per
{
	public static void main(String x[])
	
	{
		System.out.println("Enter  CSE a six number in array");
		int s[]=new int[6];
		Scanner ad=new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
			
			s[i]=ad.nextInt();
		}
		System.out.println("Enter ETC a six number in array");
		int e[]=new int[6];
		for(int i=0;i<e.length;i++)
		{
			e[i]=ad.nextInt();
		}
		CSE C=new CSE("Rushi",1,"pune","2021");
		C.calper(s);
		C.showCsePer();	
		ETC E=new ETC("Rahul",2,"Beed","2022");
		E.calper(e);
		E.showCsePer();
	}

}
