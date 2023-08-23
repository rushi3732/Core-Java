// 20  NumberFormatException 
package Practice;
public class NumberFormatExceptionApp {
	   public static void main(String x[])
	     { 
	   try{
	           String str="8966 ";
	           int s =Integer.parseInt(str);
	   System.out.println("S is  "+s);
	    }
	  catch(NumberFormatException error)
	   { System.out.println("error is  "+error);
	   }
	     }
}
