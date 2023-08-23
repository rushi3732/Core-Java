package File_Handing;

import java.io.*;

public class Mkdir {

	public static void main(String[] args) throws Exception {
		File f = new File("C:\\my-app\\rushi");
		if (f.exists()) {
			System.out.println("File is already Exist");
		} else {
			boolean b = f.mkdir();
			if (b) {
				System.out.println("New Floder is created");
			} else {
				System.out.println("some problem is there");
			}
		}
	}

}
