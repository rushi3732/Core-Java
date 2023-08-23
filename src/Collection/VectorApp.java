package Collection;
import java.util.*;

public class VectorApp {

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		
		  VectorAO emp1=  new  VectorAO(1,10000,"Ram");
		  VectorAO emp2 = new  VectorAO(2,20000,"Shyam");
		  VectorAO emp3 = new  VectorAO(3,30000,"Dinesh");
		  
		  Vector v= new Vector();
		  v.add(emp1);
		  v.add(emp2);
		  v.add(emp3);
		  for(Object obj:v) {
			  VectorAO e=( VectorAO)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getRuns());
		  }
	
	}
}
