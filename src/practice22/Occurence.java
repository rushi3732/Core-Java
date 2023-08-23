package practice22;
import java.util.*;

public class Occurence {

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter a number and check occurence in Number");
		int no[]=new int[6];
		int count=1;
		for(int i=0;i<no.length;i++)
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
		for(int i=0;i<no.length-1;i++)
		{
				if(no[i]==no[i+1])
				{
				count++;	
				}
				else
				{		System.out.println(no[i]+"\t"+count);
					count=1;
				}
			
		}
		
//		for(int i=0;i<no.length;i++)
//		{
//
//			System.out.println();	
//		}
		
	}

}
