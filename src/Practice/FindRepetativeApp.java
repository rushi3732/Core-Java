//Q. WAP to create the class name as FindRepetative with two values
//void setValue(int a[]): this function accept the array 
//void findRepetative(): this function is used for find the repete values
package Practice;
import java.util.*;
class  FindRepetative
{  int a[];
	void setValue(int a[])
	{
		this.a=a;
		
	}
	void findRepetative()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
			
//		System.out.println(" array values");
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		int count=1;
		System.out.println("Digit"+"\t"+"count");  
	 	for(int i=0;i<a.length-1;i++)
	 	{
	 			if(a[i]==a[i+1])
	 			{ 			
	 				count++;	
			    }
	 			else
	 			{
	 				System.out.println(a[i]+"\t"+count);  
	 				count=1;
	 			}
	    }
	}
}

public class FindRepetativeApp 
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		FindRepetative f =new FindRepetative();
		System.out.println("Enter the valaue in array");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=ad.nextInt();
		}
		f.setValue(a);
		f.findRepetative();
	}

}
