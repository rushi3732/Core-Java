package Basic;

import java.util.*;
class ArrayFreqCount
{
	int c[],freq[];
	int count;
	void setArray(int ch[],int f[])
	{
		c=ch;
		freq=f;
	}
	
	void countFreqCount()
	{
		for(int i=0;i<c.length;i++)
	{
		 count=1;
		for(int j=i+1;j<c.length;j++)
		{
			if(c[i]==c[j])
			{
				count++;
				freq[j]=0;
				
			}
		}
		if(freq[i]!=0)
		{
			freq[i]=count;
		}
	}
		System.out.println("Display Frequency");
		for(int i=0;i<c.length;i++)
		{
		if(freq[i]!=0)
		{
			System.out.printf("c[%d]---->%d\n",c[i],freq[i]);
		}
		}	
	}
	
}
public class ConvertToUpperApp 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayFreqCount ac=new ArrayFreqCount();
		int a[]=new int [6];
		int freq[]=new int [90];
		
		System.out.println("Enter the values of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			freq[i]=1;
		}
		ac.setArray(a,freq);
		ac.countFreqCount();
				
	}

}