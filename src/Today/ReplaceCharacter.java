package Today;
import java.util.*;

public class ReplaceCharacter {

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		
		System.out.println("enter a string");
		String str=ad.nextLine();
		String str1=str.replace('1', '3');
		System.out.println(str1);
//		String str="1234";
//		char ch[]=str.toCharArray();
//		int l=ch.length;
//		for(int i=0;i<l;i++)
//		{
//			if(ch[i]=='2')
//			{
//				ch[i]='1';
//				
//			}
//			System.out.println(ch[i]);
//		}
	}

}
