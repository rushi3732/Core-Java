package Test;
import java.util.*;

 class InsertElementApp
 {  private int n[];
 private int value;
 private int index;
	public void  setArray(int n[])
	 {
		this.n=n;
	 }
	 void  beforeInsert()
	 {
		 System.out.println("before insert values in array");
		for(int i=0;i<5;i++)
		{
			System.out.println(n[i]);
		}
	 }
	 
	 void  afterInsert(int index,int value)
	 {
		 this .index=index;
		 this .value=value;
		for(int i=4;i>=index;i--)
         {
	         n[i+1]=n[i];
        }
		n[index]=value;
		System.out.println("after insert values in array");
		for(int i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
    }
 }

public class InsertElement {
	public static void main(String x[])
	{
		Scanner ad=new Scanner (System.in);
		 InsertElementApp ie=new  InsertElementApp();
		System.out.println("Enter five  vlaues in array");
		int no[]=new int[6];
		for(int i=0;i<no.length-1;i++)
		{
			no[i]=ad.nextInt();
		}
		ie.setArray(no);
		ie.beforeInsert();
		System.out.println("Enter a index ");
		int index=ad.nextInt();

		System.out.println("Enter a index ");
		int value=ad.nextInt();
		ie.afterInsert(index,value);
		
		
		
	
		
		
	}

}
