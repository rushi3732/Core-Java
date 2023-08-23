package Practice;
import java.util.*;

public class JaggedArray 
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		int a[][]=new int[3][];
		a[0]=new int[3];
		a[1]=new int[2];
		a[2]=new int[4];
		System.out.println("enter a values in matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=ad.nextInt();
			}
		}
		System.out.println("Print matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d \t",a[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
