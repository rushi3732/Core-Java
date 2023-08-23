/*Q. WAP to input the number and check number is armstrong or not using scanner class */
package Practice;

import java.util.*;
public class Armstrong 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
        int number =sc.nextInt();
		int temp, last=0,digit=0, sum = 0;

        temp= number;
        while(temp>0)
		{
			temp=temp/10;                                               //logic count of digit
			digit++;
		}
		temp=number;
        while (temp>0)
		{
			last=temp%10;                                                //check number is Armstrong or Not
			sum+=(Math.pow(last,digit));
			temp=temp/10;
		}

        if(sum== number)
            System.out.println(number + " is an Armstrong number.");     //print number is Armstrong
        else
            System.out.println(number + " is not an Armstrong number.");  //print number is not an Armstrong
    }
}