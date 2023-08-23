package Test5;
class  ShowMessageApp extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<=5;i++)
			{
				sleep(10000);
				System.out.println("Good Afternoon");
			
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
}

public class ShowMessage {

	public static void main(String[] args) throws Exception {
		ShowMessageApp s=new ShowMessageApp ();
		s.start();
	
		System.out.println("start");
		
      
	}

}
