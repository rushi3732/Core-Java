package Basic;
interface ABC{
	public void s1();
	public void s2();
	public void s3();
	
}
class ADP implements ABC{
	
	public void s1() {
		
	}
	public void s2() {
		
	}
	public void s3() {
		
	}
	
}
class MNO extends ADP
{
	public void s1()
	{
		System.out.println("i required this method s1");
		
	}
}
class XYZ extends ADP
{
	public void s2()
	{
		System.out.println("i required this method  s2");
		
	}
}
class PQR extends ADP
{
	public void s3()
	{
		System.out.println("i required this method s3");
		
	}
}

public class Interface {
	public static void main(String x[]){
		 MNO m=new  MNO();
		 m.s1();
		 XYZ xy=new XYZ();
		 xy.s2();
		 PQR p=new PQR();
		 p.s3();
		
	}

}
