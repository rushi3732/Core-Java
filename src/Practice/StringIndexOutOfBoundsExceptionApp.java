//Q21. WAP to handle the StringIndexOutOfBoundsException
package Practice;
public class StringIndexOutOfBoundsExceptionApp {
	public static void main(String x[])
    {   
  try{
         int no[]=new int[]{10,20,30};
         System.out.println(no[3]);
    }
  catch(ArrayIndexOutOfBoundsException error)
    { System.out.println("Error is  "+error);
    }
    }
}
