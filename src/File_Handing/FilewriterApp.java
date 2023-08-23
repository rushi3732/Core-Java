package File_Handing;
import java.io.*;
import java.util.*;

public class FilewriterApp {

	public static void main(String[] args)throws Exception {
		FileWriter f=new FileWriter("C:\\my-app\\rushi\\resume.txt",true);
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter a data");
		String data=ad.nextLine();
		f.write(data);
		f.close();
		System.out.println("Data save successfully..................");
	

	}

}
