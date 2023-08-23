// 19 WAP to handle the NullPointerException 
package Practice;
import java.util.*;
class A
{
 void show()
 {
  System.out.println(" i am show method");
 }
}
public class NullPointerExceptionApp
{
 static int a[];
 public static void main(String x[])
 {
  try{
      a[0]=200;
	 }
  catch(NullPointerException ex)
  {
   System.out.println("Memory not allocated properly");
  }
 }
}