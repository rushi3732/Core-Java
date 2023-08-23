package File_Handing;
import java.io.*;
public class FileExample1 
{
	public static void main(String xyz[]) 
	{
		FileInputStream f1=new	FileInputStream ("C:\\Java Program\\Folder\name.txt");
		System.out.println("Can file Read "+f1.canWrite());
		System.out.println("is file exist"+f1.exists());
		System.out.println("File name"+f1.getName());
		System.out.println("Length of the "+f1.length());
		
	}

}
 