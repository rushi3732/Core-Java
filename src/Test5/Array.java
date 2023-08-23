package Test5;
import java.util.*;


public class Array {
	public static void main(String x[]) {
	Scanner ad=new Scanner(System.in);
	int no[]=new int[10];
	System.out.println("Enter a number in array");
	for(int i=0;i<no.length;i++) {
		no[i]=ad.nextInt();
	}
	System.out.println("Ansending");
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
	for(int i=0;i<no.length;i++) {
		System.out.printf("[%d --->]%d \n",i,no[i]);
	}
	System.out.println(" Decending");
	for(int i=0;i<no.length;i++)
	{
		for(int j=i+1;j<no.length;j++) 
		{
			if(no[i]<no[j])
			{
				int temp=no[i];
				no[i]=no[j];
				no[j]=temp;
			}
			
		}
	}
	for(int i=0;i<no.length;i++) {
		System.out.printf("[%d --->]%d \n",i,no[i]);
	}
		
		
	}

}
