import java.util.*;
public class rray {
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		int no[]=new int[6];
		System.out.println("enter a number");
		for(int i=0;i<no.length;i++)
		{
			no[i]=ad.nextInt();
		}
		int sum=0;
		for(int i=0;i<no.length-1;i++)
		{
			for(int j=i+1;j<no.length;j++)
			{
				sum=sum+no[i]+no[j];
				if(15==sum) 
				{
					System.out.println(sum+"\t"+no[i]+"\t"+no[j]);
					break;
				}
//				else {
//					System.out.println("else"+sum);
//				
//				}
				
	
			}
			sum=0;
		}
		
	}//684-579

}
