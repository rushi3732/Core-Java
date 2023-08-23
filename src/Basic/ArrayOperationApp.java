package Basic;
import java.util.Scanner;
interface ArrayOperations
{
	void performOpertion(int x[]);
}
class Sort implements ArrayOperations
{
	public void performOpertion(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println("Sorting  array values");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}
}
class insertions implements   ArrayOperations
{   
	int no,ind;
	void setValue(int value,int index)
	{
		no=value;
		ind=index;
	}
	public void performOpertion(int x[])
	{
		  System.out.println("inserting array values");
		  for(int i=x.length;i>ind;i--)
			{
		    	x[ind]=x[ind-1];
			}
		     x[ind]=no; 
			System.out.println("after  array values");
			for(int i=0;i<x.length;i++)
			{
				System.out.println(x[i]);
			}
	}
}
class Deletion implements ArrayOperations
{
	int ind;
	void setIndex(int index) 
	{
		ind=index;
	}
	public void performOpertion(int x[])
	{
		for(int i=0;i<x.length-1;i++)
		{
			if(x[i]==ind)
			{
			for(int j=i;j<x.length-1;j++)
			{
			  x[j]=x[j+1];
			}
			break;
			}
		}
		System.out.println("After Delete"+"\n");
		for(int i=0;i<x.length-1;i++)
		{
		System.out.println(x[i]);
		}
	}
}
public class ArrayOperationApp
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("enter a six values in array");;
		int no[]=new int [6];
		for(int i=0;i<no.length;i++)
		{
			no[i]=ad.nextInt();
		}
		Sort  s=new Sort ();
		insertions in=new insertions();
		Deletion d=new  Deletion();
		System.out.println("Sorting"+"\n"+"insertion"+"\n"+"deletion"+"\n"+"Reverse");
		int ch=ad.nextInt();
		switch(ch)
		{
		case 1:
		s.performOpertion(no);
		break;
     	case 2:
			System.out.println("value"+"\n"+"index");
			int value=ad.nextInt();
			int index=ad.nextInt();
			in.setValue(value, index);
			in.performOpertion(no);
			break;
	    case 3:
		System.out.println("index");
		int ind=ad.nextInt();
		d.setIndex(ind);
		d.performOpertion(no);
		break;
	  }	
	}
}
