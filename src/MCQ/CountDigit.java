package MCQ;
//Q1. WAP to Create class name as CountDigit with Parameterized constructor
//means constructor contain single parameter of type integer and int countDigit ()
//method. Constructor accept the integer parameter and countDigit() method
//return the number of digit from number
import java.util.*;
class CountDigitAPP 
{
	 CountDigitAPP(int n)
	{
		  int count = 0;
		    while (n != 0)
		    {
		        n = n / 10;
		        ++count;
		    }
		System.out.println(count);
		
	}

}
public class CountDigit
{
	public static void main(String x[])
	{
		System.out.println("Enter a number and count the number of Digit");
		Scanner ad=new Scanner(System.in);
		int no=ad.nextInt();
		CountDigitAPP c=new CountDigitAPP(no);	
	}
}
