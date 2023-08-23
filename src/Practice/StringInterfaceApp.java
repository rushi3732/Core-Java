//18Q.WAP to create the interface name as StringInterface with a method name as
//
//void acceptString(String): this function accept the string 
//and create the one child class name as SortString and implement the interface in it 
//and sort the string without using any inbuilt function 

package Practice;
import java.util.*;
interface StringInterface                                     
{                                     
    void acceptString(String str);                           
}
class SortString implements StringInterface                  
{                  

    public void acceptString(String str) {                   

      char c[]= str.toCharArray();
      String r=" ";
        System.out.println("Sorted string: ");
        for (int i = 0; i < c.length; i++) 
        {
            for(int j =i+1; j<c.length; j++)
            {                
                if (c[i] >= c[j])
                {
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
            r = r+c[i];
        }
        System.out.println(r);
    }
}
public class StringInterfaceApp
{
    public static void main(String[] args) 
	{           
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();                     

        SortString s = new SortString();             
        s.acceptString(str);                           
    }
}