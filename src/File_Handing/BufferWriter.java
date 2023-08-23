package File_Handing;
import java.io.*;
import java.util.*;

public class BufferWriter {

	public static void main(String[] args)throws Exception {
		FileWriter f=new FileWriter("C:\\my-app\\rushi\\resume.txt",true);
		BufferedWriter bw=new BufferedWriter(f);
		Scanner ad=new Scanner(System.in);
		System.out.println("enter a data ");
		String data=ad.nextLine();
		bw.write(data);
		bw.newLine();
//		bw.write(data,5,10);
	
		bw.close();
		f.close();
		System.out.println("data save successfully");
		
		

	}

}
