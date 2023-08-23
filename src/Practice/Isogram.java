

/*Q. WAP to create the class name as CheckIsogram with a two functions
void acceptString(String): this function is used for accept the string
void checkIsogram(): this function is used for check string is isogram or not 
note: An Isogram is a word in which no letter occurs more than once.*/
package Practice;
import java.util.*;
class CheckIsograms
{
  String str;
  public void acceptString(String s)                           //accept string
  {
	  str=s;
  } 
  void check()                                               //check String is isogram or not
  {
	  char ch[]=str.toCharArray();
	  int flag=0;
	  for(int i=0;i<ch.length;i++)
	  {
		  for(int j=i+1;j<ch.length-1;j++)
		  {
			  if(ch[i]==ch[j])
			  {
				  flag=1;
				  break;
			  }
		  }
	  }
	  if(flag==1)
	  {
		  System.out.println("string is not iosogram");
	  }
	  else
	  {
		System.out.println("string is iosogram");  
	  }
  }
}

public class Isogram
{
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s=sc.next();
	CheckIsograms c=new CheckIsograms();
	c.acceptString(s);
	c.check();
}
}