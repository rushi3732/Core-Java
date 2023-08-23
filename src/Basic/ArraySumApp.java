package Basic;
import java.util.*;
class  ArraySum
{   int rem,result=0,n[];
	void setValues(int ...n)//accept number
	{
		this.n=n;
		
	}
	void calSum()
	
	{
		for(int i=0;i<n.length;i++)
		{
			result=result+n[i];
			
		}
		System.out.println("Sum is "+result);//display result
	}	
	}

public class ArraySumApp
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);//create object of Scanner class
		 ArraySum a=new  ArraySum();//create object of ArraySum
	 System.out.println("Enter a number and  calculate sum of all values");
		int no[]=new int[5];//create array size of 5
		for(int i=0;i<no.length;i++)
		{
			no[i]=ad.nextInt();//accept value from user
		}
		a.setValues(no);//pass parameter to function
		a.calSum();//call show CalSum Function
		
	}


}
