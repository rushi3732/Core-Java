package Exception;
import java.util.*;

import java.util.Scanner;

public class TryFinally {   
	.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ad=new Scanner(System.in);
		System.out.println("enter two number");
	int first=ad.nextInt();
	int second= ad.nextInt();
	try {
		int result=first/second;
		System.out.println(result);
	}
	finally {
		System.out.println("Boom Guys.................................");
	}

	}

}
