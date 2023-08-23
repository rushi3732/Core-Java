package Collection;
import java.util.*;

public class VectorRemoveElement {
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		 Vector v=new Vector();
		 v.add(10);
		 v.add(20);
		 v.add(30);
		 v.add(40);
		 v.add(50);
		 v.add(60);
		 System.out.println("Delete the value in collection");
		 int no=ad.nextInt();
		 int index=v.indexOf(no);
		 if(index!=-1)
		 {
			 v.remove(index);
			 System.out.println("Number is deleted in collection");
		 }
		 else
		 {
			 System.out.println("Number is not  deleted in collection"); 
		 }
		 
	}

}
