package Test;
import java.util.*;

public class Largest {

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter a number of size array");
	     int size=ad.nextInt();
	     System.out.println("enter "+size+"number in array");
		int no[]=new int[size];
		for(int i=0;i<no.length;i++)
		{
			no[i]=ad.nextInt();
		}
		for(int i=0;i<no.length-1;i++)
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
			if(no[i]==no[size-1])
			{
				System.out.println(no[size-1]);
			}
		}
	
	}

}
