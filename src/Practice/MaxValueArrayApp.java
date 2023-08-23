package Practice;
import java.util.*;
 class MaxValueInArray
{  int max;
	 void acceptArray(int no[])
	 {
		 for(int i=0;i<no.length;i++)
		 {
			 max=no[0];
			 if(no[i]>max)
			 {
				 max=no[i];
			 }
		 }
		 System.out.println("Max number is"+max);
		 
	 }
	
}



public class MaxValueArrayApp
{
	public static void main(String x[])
	{

		Scanner ad=new Scanner(System.in);
		System.out.println("enter a array values");
		MaxValueInArray m =new MaxValueInArray();
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=ad.nextInt();
		}
		m.acceptArray(a);
		
	}

}
