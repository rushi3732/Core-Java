+package Basic;
import  java.util.*;
class SumApp
{
	void setCalSum(int ...x)
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			 sum=sum+x[i];
		}
		System.out.println("sum ="+sum);
	}
	
};

public class Sum {
	public  static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter a Array value And CALCULATE ITS SUM"); 
		SumApp s=new SumApp();
		int a[]= new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=ad.nextInt();
		}
		s.setCalSum(a);
	}

}
