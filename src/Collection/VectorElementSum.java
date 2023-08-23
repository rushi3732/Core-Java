package Collection;
import java.util.*;
import java.util.*;

public class VectorElementSum 
{
public static void main(String  x[])
{
	Vector V=new Vector();
	V.add(10);
	V.add(20);
	V.add(30);
	V.add(40);
	V.add(50);
	int Sum=0;
	for(Object obj:V)
	{
		Sum=Sum+(int)obj;
	}
	System.out.println(Sum);
}
	
	
}
