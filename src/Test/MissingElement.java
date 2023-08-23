package Test;

import java.util.*;

public class MissingElement {

	public static void main(String[] args) {
		Scanner ad = new Scanner(System.in);
		System.out.println("enter a size in array");
		int size = ad.nextInt();
		System.out.println("enter" + (size) + "number in array");
		int no[] = new int[size];
		for (int i = 0; i < no.length; i++)

		{
			no[i] = ad.nextInt();
		}
		for (int i = 0; i < no.length; i++) {
			System.out.println(no[i]);
		}
		int n = no.length;

		int total = 1;
		for (int i = 2; i <= (n + 1); i++) {
			total += i;
			System.out.println("plus"+total);
			total -= no[i - 2];
			System.out.println("minas"+total);
		}
		System.out.println("\n"+total);

	}

}
