package Thread;
class B extends Thread{
	public void run()
	{
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.println("First thread is"+i);
				sleep(10000);
			}
			
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}
class Z extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<=50;i++)
			{
				System.out.println("second thread id"+i);
				sleep(1000);
				
			}
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}

public class ThreadFirstApp {

	public static void main(String[] args) {
		B al=new B();
		al.start();
		Z cl=new Z();
		cl.start();

	}

}
