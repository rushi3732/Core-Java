package Basic;
import java.util.*;
class Convert
{
	char c[];
	void setCharArray(char ch[])
	{
		c=ch;
	}
	void converToUpperCase()
	{
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a'&&c[i]<='z')
			{
				int ch=(int)c[i]-32;
				c[i]=(char)ch;
			}
		}
		System.out.println("Afte Converstion is");
		for(int i=0;i<c.length;i++)
		{
			System.out.printf("c[%d]------>%c\n",i,c[i]);
		}
	}
};
public class ConvertToUpper {
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("enter a character in array");
		Convert c=new Convert();
	String ch;
	ch=ad.next();
	char[] str=ch.toCharArray();
	c.setCharArray(str);
	c.converToUpperCase();
	
	}

}
