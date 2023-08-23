package Basic;
class Value
{
	int a,b;
	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
}
class Add extends Value
{
	void showAdd(){
		
		System.out.println("Addition is "+(a+b));
		
	}
	
}
class Sub extends Value
{
void showSub(){
		
		System.out.println("Subtraction is "+(a-b));
		
	}
	
}
class Mul extends Value
{
void showMul(){
		
		System.out.println("Multraction is "+(a*b));
		
	}
	

}
public class inheritance

{
	public static void main(String x[])
	{
		
		 Add a =new  Add();
		 a.setValue(10,20);
		 a.showAdd();
		 Sub s=new Sub();
		 s.setValue(10,20);
		 s.showSub();
		 Mul m=new  Mul();
		 m.setValue(10, 20);
		 m.showMul();
		 
		 
	}

}
