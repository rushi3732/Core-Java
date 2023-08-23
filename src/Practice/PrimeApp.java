//Q.WAP to create the class name as FindPrime with a constructor
//input the number and check number is prime or not 
package Practice;
import java.util.*;
class Prime
{ int count=0;
	Prime(int no)
	{
		for(int i=1;i<=no;i++) 
	{
			if(no%i==0)
					{
						count++;
					}
	
		}
		if(count ==2)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not  prime");
		}
	}
}

public class PrimeApp {
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("enter a number and check number is prime or not");
		int no=ad.nextInt();
     Prime p=new Prime(no);
	}

}
