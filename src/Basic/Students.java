package Basic;
import java.util.*;
class Stud
{ 
 int id;
 String name;
 int per;
 int totalFees;
 int disFees;
 int actualPaidFees;
void setId(int id)
 { this.id=id;
 }
 int getId()
 {
	 return id;
 }
 void setName(String name)
 { this.name=name;
 }
 String getName()
 { 
	 return name;
 }
 void setPer(int per)
 { this.per=per;
 }
 int getPer()
 { 
	 return per;
 }
 void setTotalFees(int totalFees )
 { this.totalFees=totalFees;
 }
 int getTotalFees()
 { return totalFees;
 }
 void setDisFees(int disFees )
 { this.disFees=disFees;
 }
 int getDisFees()
 { return disFees;
 }
 void setActualPaidFees(int actualPaidFees )
 { this.actualPaidFees=actualPaidFees;
 }
 int getActualPaidFees()
 { return actualPaidFees;
 }
};
class DiscountFess
{
	Stud stud;
	int DisFees=0;
	int total=0;
	void setStudent(Stud stud)
	{
		this.stud=stud;
	}
	void setDiscountEligilibity(int per)
	{
		if(per>60)
		{ 
			total=stud.getTotalFees();
			DisFees=total*30/100;
			stud.setDisFees(DisFees);
		}
			stud.setActualPaidFees(total-DisFees);
	}
	void show()
	{
		System.out.println(stud.getId()+"\t"+stud.getName()+"\t"+stud.getPer()+"\t"+stud.getTotalFees()+"\t"+stud.getDisFees()+"\t"+stud.getActualPaidFees());	
	}
}

public class Students 
{
	public  static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		DiscountFess d=new DiscountFess();
		Stud s=new Stud();
		System.out.println("enter Name  Id Per TotalFees");
		String name=ad.nextLine();
		int id=ad.nextInt();
		int per=ad.nextInt();
		int totalFees=ad.nextInt();
		s.setId(id);
		s.setName(name);
		s.setPer(per);
		s.setTotalFees(totalFees);
		d.setStudent(s);
		d.setDiscountEligilibity(per);
		d.show();
	}
}
