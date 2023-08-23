package Basic;
import java.util.*;
class MinMax
{
	int a[],f,l,j,i;
	 void setValues(int s[])
	 {
		 a=s;
	 }
	 void Sotring(){
			System.out.printf("Before sorting");
		 for(int i=0;i<5;i++)
		 {
				System.out.printf("%d",+a[i]);
		 }
	 }
	 void Missing()
	 {
		 for( i=1;i<a.length;i++)
		 {
//		 f=a[i];
//		 l=a[i+1];
//		 for(j=f+1;j<l;j++)
//		 {
//		     System.out.printf("%d",j);	
//		 }
			 if(a[i]==0)
			 {
				 System.out.printf("%d",i);	 
			 }
		 }
	 }
	
}

public class MinMaxApp {
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		MinMax m =new MinMax();
		System.out.println("Enter a six number and  fingd the missing values in array ");
		int s[]=new int[5];
		for(int i=0;i<5;i++)
		{
			s[i]=ad.nextInt();
		}
		m.setValues(s);
		m.Sotring();
		m.Missing();
		
		
	}
	

}
