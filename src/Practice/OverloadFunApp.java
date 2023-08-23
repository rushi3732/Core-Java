//Q. WAP to create the program using function overloading 
//     class OverloadFun with a two functions 
//   
//     void setValue(int square) : this function can calculate the square of integer number
//     void setValue(int float) : this function can calculate the square of float
//      void setValue(char ch[]) : this function can convert the lower case character array to upper case 
package Practice;
import java.util.*;
class OverloadFun
{
	void setValue(int square)
	{
		System.out.println("Square is"+square*square);
		
	}
	void setValue(float square)
	{
		System.out.println("float Square is"+square*square);
	}
	 void setValue(char ch[])
	 {
		   for(int i=0;i<ch.length;i++)
		   {
		    if(ch[i]>='a' || ch[i]<='z')
			{
			  ch[i]=(char)((int)ch[i]-32);
			}
		   }
		   System.out.println("character array after conversion");
		   for(int i=0;i<ch.length;i++)
		   {
		    System.out.print(ch[i]);
		   }
		 	
	 }
}

public class OverloadFunApp {
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		 System.out.println("enter Square");
		int square=ad.nextInt();
//		 System.out.println("enter float Square");
//		float fSquare;
//		fSquare=ad.nextFloat();
		char n[]=new char[5];
		 System.out.println("enter character array");
		   n=ad.next().toCharArray();
		OverloadFun o1=new OverloadFun();
		OverloadFun o2=new OverloadFun();
		OverloadFun o3=new OverloadFun();
		o1.setValue(square);
		o2.setValue(5.5f);
		o3.setValue(n);
		
		
		
	}

}
