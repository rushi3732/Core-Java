package Exception;
import java.util.*;

public class DivAppication {
	public static void main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("enter two number");
	int first=ad.nextInt();
	int second= ad.nextInt();
	try {
		int result=first/second;
		System.out.println(result);
	}
	catch(Exception ex){
		System.out.println("hiiiiii..................");
		System.out.println(ex);
		
	}
		
	}

}
