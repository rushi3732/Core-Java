//Q. WAP to create the name as Per with a function acceptMarks(int a[])
//and two child classes name as Nine and Ten 
//In Nine class we have the function void calPer() in this function we have to calculate 
//the percentage using 6 marks and in Ten class we have to override the 
//acceptMarks(int a[]) and calculate the marks using best of five technique 
//means here we have to arrange all marks of students in descending order
//and take top most five subject marks and calculate its percentage 
package Practice;
import java.util.*;
class Per
{   int a[];
	void acceptMarks(int a[])
	{
	this.a=a;	
	}
	
}
class Nine extends Per
{
	 int per;
	 void calPer()
	 {
		int agg=0;
		 for(int i=0;i<a.length;i++)
		 {
			 agg=agg+a[i];	 
		 }
		 per=agg/6;
			System.out.println("percentage is "+per+"\n");
	 }
	
}
class Ten extends Per
{
	void acceptMarks(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("top most five subject marks");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]+"\t");
		}
	}
}

public class PerApp {
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter a six subject marks");
		int a[]=new int [6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=ad.nextInt();
		}
		
		
		Nine n=new Nine();
		n.acceptMarks(a);
		Ten t=new Ten();
		n.calPer();
		t.acceptMarks(a);
		
		
	}

}
