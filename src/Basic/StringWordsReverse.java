package Basic;

import java.util.*;

public class StringWordsReverse {

	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int start=0,end;
		boolean flag=false;
		System.out.println("Enter the string ");//rushi sawant
		String str=scan.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
				
			{
			
				end=i-1;
				for(int j=start;j<=end;j++)
				{
					System.out.println("i..................f");
					char temp=ch[j];//rus
					ch[j]=ch[end];//ihs
					ch[end]=temp;//rus
					end--;
				}
				flag=true;
			}
			else if(flag)
			{
				System.out.println("first else");
				start=i;
				flag=false;
			}
			else if(i==ch.length-1)
			{
		
				end=i;
				for(int j=start;j<=end;j++)
				{
					System.out.println("second else");
					char temp=ch[j];
					ch[j]=ch[end];
					ch[end]=temp;
					end--;
				}
			}
			else
			{
				System.out.println("else");
				flag=false;
			}
		}
		System.out.println("Display the String after Reverse");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}
}
