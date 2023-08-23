package Basic;
import java.util.*;
class StudentApp
{
	private int no[],agg=0,per,i;
	 void setStdMarks(int a[])
	{
		no=a;
	}
	 void calCulPer()
	{
		for(i=0;i<no.length;i++)
		{
			agg=agg+no[i];
		}
		per=agg/no.length;
		
	}
	 void checkGrade()
	{
		if(per>70&&per<=100)
		{
			System.out.println("first division");
		}
		else if(per>60&&per<=70)
		{
			System.out.println("second division");
		}
		else if(per>50&&per<=60)
		{
			System.out.println("third division");
		}
		else if(per>40&&per<=50)
		{
			System.out.println("four division");
		}
		else
		{
			System.out.println("Grade Fail");
		}
	}

};

public class  Student
{
	public static void  main(String x[])
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter a six subject marks");
		StudentApp s=new StudentApp();
		int a[]=new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=ad.nextInt();
		}
		s.setStdMarks(a);
		s.calCulPer();
		s.checkGrade();
	}
}