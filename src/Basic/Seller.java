package Basic;
import java.util.*;
class SellerApp
{ 
	private int sp;
	private int cp;
	void acceptSellingCostprice(int sell, int cost)
	{
		sp=sell;
		cp=cost;
	}
	void showProfitLoss()
	{
		int loss=sp-cp;
		int profit=cp-sp;
		if(cp-sp>0)
		{
			System.out.println("Loss is"+loss+"\t"+" profit is"+profit+"\n");

			System.out.println("profit "+(profit*100/cp)+"%\t");
			System.out.println("Loss "+(loss*100/cp)+"%\t");
		}
		else
		{
			System.out.println("Loss is"+profit+"\t"+" profit is"+loss+"\n");

			System.out.println("Loss"+(profit*100/cp)+"%\t");
			System.out.println("Profit "+(loss*100/cp)+"%\t");
		}
		
	}

	
}

public class Seller 
{
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("enter selling price selling price  and cost price");
		SellerApp s=new SellerApp();
		int sp=ad.nextInt();
		int cp=ad.nextInt();
		s.acceptSellingCostprice(sp, cp);
		s.showProfitLoss();	
	}

}
