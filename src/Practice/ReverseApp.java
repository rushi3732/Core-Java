package Practice;
import java.util.*;
class Reverse
{
	void acceptArray(int a[])
	{
		
		  System.out.println("REVERSE OF ARRAY");
	        for(int i=0;i<a.length;i++)
	         {
	           for(int j=i;j<a.length;j++)
	            {
	              int temp=a[i];
	                  a[i]=a[j];
	                  a[j]=temp;
	             }
	          System.out.printf("a[%d]-->%d\n",i,a[i]);
		 
			  }
	}
}

public class ReverseApp 
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("enter a values in array");
		Reverse r =new Reverse();
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=ad.nextInt();
		}
		r.acceptArray(a);
		
	}

}
