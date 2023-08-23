package Basic;
import java.util.*;
class Array
{    int c[];
	 void setIntArray(int ch[])
	 {
		 c=ch;
	 }
	 void countFeqCount()
	 {
		 int count=1;
		 for(int i=0;i<6;i++)
		 { 
			for(int j=i+1;j<6;j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;	
				}
			}
			 
		 }
		
		  
			for(int k=0;k<6-1;k++)
			{
				
			 if(c[k]==c[k+1])
			 { 
				 ++count;
			 }
			 else
			 {
					System.out.println(c[k]+"\t"+count);
					count=1;
			 }	
		   }
	 }
}

public class ArrayFeqCount {
public static void main(String x[])
{
	Scanner ad=new Scanner(System.in);
	Array A=new Array();
	int a[]=new int [6];
	
	System.out.println("Enter the values of array");
	for(int i=0;i<6;i++)
	{
		a[i]=ad.nextInt();
	}
	A.setIntArray(a);
	A.countFeqCount();
	ad.close();

}
}
