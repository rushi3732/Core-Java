package Basic;
import java.util.*;
class Matrix
{ 
	int b[][];
	void acceptTwoDArray(int n[][])
	{
		b=n;
	}
	 void showMatrix() 
	{       System.out.println("Matrix is:"+"\n");
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<b[i].length;j++)
				{
					System.out.print(b[i][j]); 
			    }
				System.out.println("\n");
			}
	}
	
}

public class PrintMatrix 
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter 9 values in array:");
		Matrix M=new Matrix();
		int b[][]=new int[3][3];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=ad.nextInt();  
		    }
		}
		M.acceptTwoDArray(b);
		M.showMatrix();
		
		
		
	}

}
