package Practice;

public class Star {
	public static void main(String x[]) {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
			if(i>=j)
			{
				if(i==1||i==3)
				{
					System.out.println("@"+"\t");
				}
				else
				{
					System.out.println("*"+"\t");	
				}
			}
			else
			{
				System.out.print(" ");
			}
			
			
			}
			System.out.print("\n");
			
			
		}
		
	}

}
