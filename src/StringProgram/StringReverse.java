package StringProgram;

import java.util.*;

public class StringReverse {
	public static void main(String x[]) {
		System.out.println("enter a string");
		Scanner ad = new Scanner(System.in);
		String str = ad.nextLine();
		int start = 0, end;
		boolean flag = false;
		char ch[] = str.toCharArray();
		for (int i =0; i<ch.length; i++) 
		{
			if (ch[i] == ' ') 
			{
				end = i - 1;
				for (int j = start; j <=end; j++) 
				{
					char temp = ch[j];
					ch[j] = ch[end];
					ch[end] = temp;
					end--;
				}
				flag=true;
			} else if (flag) 
			{
				start = i;
				flag=false;

			}
			else if(i==ch.length-1)
			{
				end=i;
				for (int j = start; j <=end; j++) 
				{
					char temp = ch[j];
					ch[j] = ch[end];
					ch[end] = temp;
					end--;
				}
			}
			else 
			{
				flag=false;
			}
			
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}

	}
}
