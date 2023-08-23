/*17Q. WAP to create the abstract class name as StringParent with abstract method 
void acceptString(String str): this function can accept the string value
and we have the some child classes 
ConvertToUpper we have to override StringParent in ConvertToUpper 
and convert lower case string to upper case without using inbuilt function */

package Practice;
import java.util.*;
abstract class StringParent
{
abstract void acceptString(String str);
}
class convert extends StringParent
{
void acceptString(String str)
{
 char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
	 if(ch[i]>='a' || ch[i]<='z')
	 {
	  ch[i]=(char)((int)ch[i]-32);
	 }
	}
for(int i=0;i<ch.length;i++)
{
 System.out.printf("%c",ch[i]);
}
}
}
public class StringParentApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
String s;
System.out.println("enter the string");
s=sc.nextLine();
StringParent s1=new convert();
s1.acceptString(s);
}
}