package Today;

import java.util.*;

class FirstChar {
	public void FirstCharofWord(String s) {
		char ch[] = s.toCharArray();
		int start = 0;
		boolean flag = false;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				flag = true;
				if (ch[start] >= 'a' && ch[start] <= 'z') {
					ch[start] -= 32;
					System.out.print(ch[start] + "." + "");
				} else {
					System.out.print(ch[start]);
				}
			} else if (flag) {
				start = i;
				flag = false;

			} else {
				flag = false;

			}
		}

		for (int i = start; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}
}

public class FirstCharOfWord {

	public static void main(String[] args) {
		Scanner ad = new Scanner(System.in);
		System.out.println("enter a String\n");
		String str = ad.nextLine();
		FirstChar f = new FirstChar();
		f.FirstCharofWord(str);
	}

}
