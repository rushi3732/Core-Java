package Basic;
import java.util.*;
class MergeArrayA
{
	private int c[];
	public void mergeArray(int a[],int b[])
	{
		int len=a.length+b.length;
		int k=0;
		c=new int[len];
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[k++];
			}
		}
		displayArray();
		displayAscendingOrder();
	}
	public void displayArray()
	{
		System.out.println("Display the merge array");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		/*displayAscendingOrder();
		   				 this statement gives stack-overflow error occurs
		 because we call the function displayAscendingOrder() and in this function we
		 call the display array() so this is continues call to each other so this loop 
		 can not break so error occur stack overflow */
	}
	public void displayAscendingOrder()
	{
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		displayArray();
	}
}
public class MergeTwoArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Frist size of array");
		int size=scan.nextInt();
		System.out.println("Enter the seconf size of array");
		int size1=scan.nextInt();
		int a[]=new int[size];
		int b[]=new int[size1];
		System.out.println("Enter the values in array A");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the values in array B");
		for(int i=0;i<b.length;i++)
		{
			b[i]=scan.nextInt();
		}
		
		MergeArrayA m=new MergeArrayA();
		m.mergeArray(a, b);

	}

}