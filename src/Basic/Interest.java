package Basic;
import java.util.*;
class InterestApp
{   int pamt;
    int irate;
    int dur;
	void setPro(int pamt,int irate,int dur)
	{
	  this.pamt=pamt;
	  this.irate=irate;
	  this.dur=dur;
	}
}
class CalculateInterest extends InterestApp
{
	void calInterest()
	{
		System.out.println("Interest loan is+"+((pamt*irate*dur)/100));
	}
}
public class Interest {
	public static  void main(String x[])
	{
			Scanner ad=new Scanner(System.in);
			System.out.println("Enter amount,rate,dur");
			int pamt=ad.nextInt();
			int irate=ad.nextInt();
			int dur=ad.nextInt();
			CalculateInterest c=new CalculateInterest();
			c.setPro(pamt, irate, dur);
			c.calInterest();
			
			
	}

}
