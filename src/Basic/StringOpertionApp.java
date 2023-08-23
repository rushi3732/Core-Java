package Basic;
import java.util.*;
abstract class StringsOperation
{
	abstract void performOperation1(String ch);

}
class ConvertUpper extends  StringsOperation
{
	
	public  void  performOperation1(String ch)
    {
		
		char[] str=ch.toCharArray();
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]>='a'&&str[i]<='z')
			{
				int c=(int)str[i]-32;
				str[i]=(char)c;
			}
		}
		System.out.println("Upper ");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]);
		}
		
	}


}
class  MaxRepetativeChar extends  StringsOperation
{
	
	public void performOperation1(String ch) 
	{      
		
		  int[] arr=new int [127]; 
		  for (int i = 0; i <ch.length(); i++)
		   arr[ch.charAt(i)]=arr[ch.charAt(i)]+1;
		  int max = -1;
		  char result = ' ';

		  for (int i = 0; i < ch.length(); i++)
		  {
		   if (max < arr[ch.charAt(i)])
		   {
		    max = arr[ch.charAt(i)];
		    result = ch.charAt(i);
		   }
		  }

		  System.out.print("  MaxRepetativeChar is "+"\n");
			System.out.print(result);
		   
	}
		
	
}
class WordReverse extends  StringsOperation
{
	public void  performOperation1(String ch)
	{
		  
		  char[] str=ch.toCharArray();
	      int n = str.length;
	      char result[] = new char[n];
	      for(int i = 0; i<str.length; i++)
	      {
	         result[n-1] = str[i];
	         n = n - 1;
	      }
		
	
	      System.out.println("  WordReverse   is "+"\n");
			System.out.print(result);	
	}
}
public class StringOpertionApp {
	public static void main(String p[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter your charecter ");
		String ch=ad.nextLine();
	
		System.out.println("Enter your choice ");
		System.out.println("case 1:ConveroUpper");
		System.out.println("case 2: MaxRepetativeChar");
		System.out.println("case 3:wordReverse");
		int no=ad.nextInt();
		
	    switch(no)
	    {
	    case 1:
	    	StringsOperation c =new ConvertUpper();
		c.performOperation1(ch);
		break;
	    case 2:
	    c=new MaxRepetativeChar();
	    	c.performOperation1(ch);
			break;
	    default:
	    	c=new WordReverse();
			c.performOperation1(ch);
			break;
		}
	}

}
