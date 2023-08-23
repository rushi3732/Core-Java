package Basic;
import java.util.*;
 class PrimeApp {
	int no,i,flag=1;
	void setNumber(int no)
	{
		this.no=no;
	}
 void displayNumber()
 {
	 for(i=2;i<no;i++)
	 {
		 if(no%i==0)
		 {
			 flag=0;
		 }
	 }
	 if(flag==1)
	 {
		 System.out.println("number is prime");
	 }
	 else
	 {
		 System.out.println("number is  not prime"); 
	 }
 }
};
public class Prime
{
	public static void main(String x[]) {
	 System.out.printf("enter a number and check number is  prime or not");
	 Scanner ad= new Scanner(System.in);
	 int no=ad.nextInt();
	 PrimeApp P=new PrimeApp();
	 P.setNumber(no);
	 P.displayNumber();
}
	
}

