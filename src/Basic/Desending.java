package Basic;
import java.util.*;
class Desendings{
	int i,j,temp,a[];
	void setArray(int a[])
	{
	this.a=a;
	
	}
		
	
	void sortArray()
	{
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
				   temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}

		System.out.println("Desending Array list ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

};

public class Desending {
	public static void main(String x[])
	{
		Scanner ad= new Scanner(System.in);
		int i;
		Desendings D=new Desendings();
		System.out.println("Enter a array value");
		int a[]=new int[5];
		for(i=0;i<a.length;i++)
		{
		 a[i]=ad.nextInt();
		}
		 D.setArray(a);
		 D.sortArray();

 }
}