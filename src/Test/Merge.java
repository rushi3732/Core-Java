package Test;
import java.util.*;

public class Merge {
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter a  five  value in first array");
		int first[]= new int[5];
		int second[]=new int[5];
		int marge[]=new int[10];
		for(int i=0;i<first.length;i++)
		{
			first[i]=ad.nextInt();
		}
		System.out.println("Enter a  five  value in  second array");
		for(int i=0;i<second.length;i++)
		{
			second[i]=ad.nextInt();
		}
		
		for(int i=0;i<first.length;i++)
		{
			marge[i]=first[i];
		}
		for(int i=0;i<second.length;i++)
		{
			marge[i]=second[i];
		}
		for(int i=0;i<first.length;i++)
		{
			marge[i]=first[i];
		}
		for(int i=0;i<10;i++)
		{
		System.out.println(marge[i]);
		
		}
	}

}
