package practice22;
import java.util.*;

public class Marge
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter a  number in First array");
		int first[]= new int[5];
		int c[]= new int[10];
		int i;
		for( i=0;i<first.length;i++)
		{
			first[i]=ad.nextInt();
		}
		System.out.println("Enter a  number in second array");
		int second[]= new int[5];
		for( i=0;i<first.length;i++)
		{
			second[i]=ad.nextInt();
		}
		for(i=0;i<first.length;i++)
		{
			 c[i]=first[i];
		}
		for(int j=0;j<second.length;j++)
		{
			 c[i]=second[j];
			 i++;
			 
		}
		System.out.println("marge array list");
		for( i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		
	}

}
