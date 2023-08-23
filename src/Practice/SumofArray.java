//Q. WAP create the 3 x 3 matrix and perform the sum of every row
//
//1	2	3   = 6
//4	5	6   = 15
//7	8	9   =  24
package Practice;
import java.util.*;
public class SumofArray 
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);

		System.out.println("Enter values in array");
		int a[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=ad.nextInt();
			}
		
		}
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d \t",a[i][j]);
				sum=sum+a[i][j];
			}
			System.out.println(sum);
			System.out.println();
		}
		
	}

}
