package Basic;
import java.util.*;
class  Armstrong
{   int rem,result=0,am;
	void setValue(int no)//accept number
	{
		am=no;
		while(no!=0)//check condition
		{
			rem=no%10;
			result=result+rem*rem*rem;
			no=no/10;
		}
		if(result==am)//check number equal your enter number
		{
			System.out.println("ArmString number is"+result);	
		}
		else
		{
			System.out.println(" number is not ArmString "+result);
		}
	}
	
}
public class ArmstrongApp {
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);//create object of Scanner class
		Armstrong a =new Armstrong();//create object of Armstrong class
		System.out.println("Enter a number and check number ArmStrong or not");
		int no=ad.nextInt();//Get value  from user
		a.setValue(no);//pass parameter
		
	}

}
