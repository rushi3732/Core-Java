
package Basic;
import java.util.*;
 class Find{
	int i,j,Max,Min, a[];
	void setArray(int a[])
	{
	this.a=a;
	}
	void sortArray()
	{
		for(i=0;i<a.length;i++)
		{
			Max=a[0];
			Min=a[0];
			for(i=1;i<a.length;i++)
			{
				if(a[i]>Max)
				{
					Max=a[i]; 
				}
				if(a[i]<Min)
				{
					Min=a[i];
				}
			}

		}
		System.out.println();
		System.out.println(" Max Array "+Max);
		System.out.println();
		System.out.println(" Min "+Min);
	

	}

};

public class FinfMax{
	public static void main(String x[])
	{
		Scanner ad= new Scanner(System.in);
		int i;
		Find F=new Find();
		System.out.println("Enter a array value");  
		int a[]=new int[5];
		for(i=0;i<a.length;i++)
		{
		 a[i]=ad.nextInt();
		}
		 F.setArray(a);
         F.sortArray();

}
}
