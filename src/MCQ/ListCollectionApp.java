package MCQ;
//Q2. WAP to create the class name as ListCollectionApp and create the ArrayList
//and store the 10 values in it and search the value from ArrayList collection 
import java.util.*;
public class ListCollectionApp
{
public static void main(String x[])
{    
	 Scanner ad=new Scanner(System.in);
	 ArrayList al = new ArrayList();
	 System.out.println("enter 10 values in collection");
	 int no[]=new int[10];
	 for(int i=0;i<no.length;i++)
	 {
		no[i]=ad.nextInt();
		al.add(no[i]);
	 }
      
      for(Object obj:al) {
      	System.out.println(obj);
      }
 	 System.out.println("enter a value ");
 	 int value=ad.nextInt();
 	boolean b=al.contains(value);
	if(b)
	{
		System.out.println("Number is present");
	}
	else
	{
		System.out.println("Number is  not present");
	
	}
 	 }
}
