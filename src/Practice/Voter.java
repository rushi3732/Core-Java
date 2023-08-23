// Q22. WAP to create the user defined exception handle it 
//we have the senario we want to input the age of student and if age is less than 
//5 then System generate the exception to us student is not illgible for voting.
package Practice;
import java.io.*;
import java.util.*;
class Voter
{
   public static void print(int a)
    {
         if(a>=18)
		 {
            System.out.println("Eligible for Voting");
         }
          else
		  {
            throw new IllegalArgumentException("Not Eligible for Voting");                         
          }
       
    }
    public static void main(String[] args)
	{    Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the age:");
	    int a=sc.nextInt();
         Voter.print(a);
    }
}