package Basic;
import java.util.*;
class BasicApp
{
	private int id;
	 private String name;
	 private int qty;
	 private int rate;
	 public void setName(String name)
	 { 
		 this.name=name;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public void setId(int id)
	 {
		 this.id=id;
	 }
	 public int getId()
	 { 
		 return id;
	 }

	 public void setQty(int  qty)
	 { 
		 this.qty=qty;
	 }
	 public int getQty()
	 {
		 return qty;
	 }
	 public void setRate(int rate)
	 { 
		 this.rate=rate;
	 }
	 public int getRate()
	 { 
		 return rate;
	 }
}
class calculrateBill
{
	void calBill(BasicApp ...b) 
	{
		int TotalBillt=0;
		System.out.println("Id"+"\t"+"Name"+"\t"+"Qty"+"\t"+"Rate"+"\t"+"TotalBill"+"\t");
		for(int i=0;i<b.length;i++)
		{
			TotalBillt=TotalBillt+(b[i].getQty()*b[i].getRate());
			System.out.println(b[i].getId()+"\t"+b[i].getName()+"\t"+b[i].getQty()+"\t"+b[i].getRate()+"\t"+(b[i].getQty()*b[i].getRate())+"\n");
		}
		System.out.println("\tTotal Bill of Order\t"+TotalBillt);
		
		
	}
	
}

public class Product {

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		
		BasicApp b[]=new BasicApp[3];
		calculrateBill c=new calculrateBill();
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println("name id qty rate");
			//b[i]=new BasicApp();
			String name=ad.next();
			int id=ad.nextInt();
			int qty=ad.nextInt();
			int rate=ad.nextInt();
			b[i].setName(name);
			b[i].setId(id);
			b[i].setQty(qty);
			b[i].setRate(rate);
		}
		c.calBill(b);
		ad.close();

		

	}

}
