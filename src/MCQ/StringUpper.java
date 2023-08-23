package MCQ;
//Q3. WAP to create the class name as StringUpper with a two methods
//void acceptString (String): this function can accept the string
//void convertToUpper(): this method can convert the lower case string to upper
//case without using inbuilt function or without using toUpperCase() method 
import java.util.*;

class StringUpperApp {

	String cha;
	void acceptString(String ch)
	{
		cha=ch;
	}
	void converToUpper()
	{
		char[] str=cha.toCharArray();
		for(int i=0;i<str.length;i++)
		{
			if(str[i]>='a'&&str[i]<='z')
			{
				int ch=(int)str[i]-32;
				str[i]=(char)ch;
			}
		}
		System.out.println("Afte Converstion is");
		for(int i=0;i<str.length;i++)
		{
			System.out.printf("c[%d]------>%c\n",i,str[i]);
		}
	}
	

}
	public class StringUpper
	{
		public static void main(String x[])
		{
			Scanner ad=new Scanner(System.in);
			System.out.println("enter a character in array");
			 StringUpperApp s=new  StringUpperApp();
		String ch;
		ch=ad.next();
		
		s.acceptString(ch);
		s.converToUpper();
		
		}
	}
		
	

