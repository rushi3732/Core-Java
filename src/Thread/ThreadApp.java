
package Thread;

class A extends Thread{
	public void run()
	{
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.printf("First Thread %d \n ",i,this.isAlive());
				if(i==3)
				{
					stop();
				}
				sleep(10000);
			} 
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
class C extends Thread
{
	public void run()
	{
		
		try {
			for(int i=1;i<=50;i++)
			{
				System.out.printf("Second Thread is %d \n",i,this.isAlive());
				sleep(1000);
			}
			
		}
		catch(Exception ex) {
			System.out.println("Error is"+ex);
			
		}
	}
	
}
public class ThreadApp {
	public static void main(String x[] )throws Exception
	{
		A al=new A();
		al.start();
		al.join();
		System.out.println("Now status of first thread is  ");
		al.isAlive();
        C c1 = new C();
        c1.start();
		
	}

}
