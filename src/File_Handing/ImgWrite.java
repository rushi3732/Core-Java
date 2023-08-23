package File_Handing;
import java.io.*;
import java.sql.*;


public class ImgWrite {

	public static void main(String[] args)throws Exception{
		 FileInputStream fr=new FileInputStream("C:\\my-app\\rushi\\a.png");
     	Writer fw=new FileOutputStream("C:\\my-app\\rushi\\a.png");
		BufferedWriter f=new BufferedWriter(fw);
		 int  data=0;
			
		 while((data=fr.read())!=-1) {
		
			 f.write(data);
			 fw.close();
			 fr.close();
			
		 }
	
		 System.out.println("Success..............");
		}
		

	

}
