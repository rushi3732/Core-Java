package Basic;
import java.util.*;
public class MyCode {
	public static void main(String[] args) {
		System.out.println("Enter 10 number in array");
		Scanner ad=new Scanner(System.in);
		int no[]=new int[10];
		for(int i=0;i<10;i++)
		{
			no[i]=ad.nextInt();
		}
		for(int i=0;i<no.length;i++)
		{
			for(int j=i+1;j<no.length;j++)
			{
				if(no[i]>no[j])
				{
					int temp=no[i];
					no[i]=no[j];
					no[j]=temp;
				}
				
			}
			
		}
		for(int i=0;i<no.length;i++)
		{
			System.out.println(no[i]);
		}
		int count=0;
		for(int i=0;i<no.length-1;i++)
     	{
//			for(int j=i+1;j<no.length-1;j++)
//	     	
//			{
				if(no[i]!=no[i+1])
				{
					count++;
				}
		}
			
//		}
		
			System.out.println(count);
		

	}

}
