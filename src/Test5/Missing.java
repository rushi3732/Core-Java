package Test5;
import java.util.*;

public class Missing {
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("enter a  9 number in array");
		int no[]=new int[10];
		for(int i=0;i<9;i++)
		{
			no[i]=ad.nextInt();
		}
		for(int i=0;i<9;i++)
		{
			for(int j=i+1;j<9;j++)
			{
			if(no[i]>no[j])
			{
			int temp=no[i];
			no[i]=no[j];
			no[j]=temp;
			}
			}
			
		}
		for(int i=0;i<10;i++)
		{
			if(i+1!=no[i])
			{
				System.out.println(i);
				
			}
		
			
		
		}
		
	}

}
