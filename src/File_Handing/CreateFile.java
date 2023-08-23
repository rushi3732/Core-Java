package File_Handing;
import java.io.*;

public class CreateFile {

	public static void main(String[] args) throws Exception {
      File f=new File("C:\\My-app\\rushi\\resume.txt");
      if(f.exists())
      {
    	  System.out.println("file is already present");
      }
      else {
    	  boolean b=f.createNewFile();
    	  if(b)
    	  {
    		  System.out.println("txt file create successfully");
    	  }
    	  else
    	  {
    		  System.out.println(" there is some problemm go there and solve it....................");
    	  }
      }
	}

}
