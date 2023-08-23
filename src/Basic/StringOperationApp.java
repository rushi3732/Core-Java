package Basic;
class StringOperations
{
	private static  StringOperations so = null;
	private String str=null;
	private StringOperations()
	{
	}
	
		public static StringOperations  getInstance()
		{
		
		if(so==null)
		{
			 so=new StringOperations();
		}
		return so;
	 
	   }
		
		public  void acceptStrings(String ss)
		{
			str=ss;
		}


         
		public void sort()
		{

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
		public void Upper()
		{
			char[] ch=str.toCharArray();
			
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>='a'&&ch[i]<='z')
				{
					int c=(int)ch[i]-32;
					ch[i]=(char)c;
				}
			}
			System.out.println("Upper ");
			for(int i=0;i<ch.length;i++)
			{
				System.out.print(ch[i]);
			    System.out.println();
			}
		}
		public void reverse()
		
		{	
			System.out.print("Reverse String"+"\t");
	        char[] arr = str.toCharArray();
	        
	        int i, length = 0;
	        length = arr.length - 1;
	 
	        for (i = 0; i < length; i++, length--)
	        {      
	            char temp = arr[i];
	            arr[i] = arr[length];
	            arr[length] = temp;
	        }
	 
	        for (char chars : arr)
	            System.out.print(chars);
	        System.out.println();
		  }
}

public class StringOperationApp {
	public static void main(String x[])
	{
		StringOperations so1=StringOperations.getInstance();
		String so11="india";
		so1.acceptStrings(so11);
		so1.Upper();
		so1.reverse();
		so1.sort();
	
		
		
//		StringOperations so2=StringOperations.getInstance();
//		String so12="India";
//		so2.acceptStrings(so12);
//		so2.Upper();
//		so2.reverse();
//		so2.sort();
		
	}
}
		
		
		
		
		
		
		
		
		
//		StringOperation so1=StringOperation.getInstance();
//		System.out.println("In Upper Case");
//		so1.string=(so1.string).toUpperCase();
//		System.out.println(so1.string);
// 		StringOperation so2=StringOperation.getInstance();
// 		System.out.println("In Lower Case");
//		so2.string=(so2.string).toLowerCase();
//    	System.out.println(so2.string);
//	
//		StringOperation so3=StringOperation.getInstance();
//		System.out.println("In Reverse Case");
//		so3.string=(so3.string).string.reverse();
//		System.out.println(so3.string);
//		StringOperation so4=StringOperation.getInstance();
//		StringOperation so5=StringOperation.getInstance();
		
//	}
//
//}
