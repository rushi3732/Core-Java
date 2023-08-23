package Test5;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
	     al.add("rushi",1,100);
	     al.add("rushi",1,100);
	     al.add("rushi",1,100);
	     al.add("rushi",1,100);
		for(Object obj:al){
			System.out.println(obj);
			
		}
		System.out.println("Asending Order");
		Collections.sort(al);
		for(Object obj:al){
			System.out.println(obj);
		}
		System.out.println("Desending Order");
		
		Collections.sort(al,Collections.reverseOrder());
		for(Object obj:al){
			System.out.println(obj);
		}
	
		
	}

}
