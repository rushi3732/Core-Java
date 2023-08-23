package File_Handing;

import java.io.File;

public class DriverListApp {

	public static void main(String[] args) {
     File f[]=File.listRoots();
     for(int i=0;i<f.length;i++)
     {
    	 System.out.println(f[i]);
    	 
    	  long totalSpace=(f[i].getTotalSpace()/1073741824);
    	  System.out.println(totalSpace+ "GB");
    	  long freeSpace=(f[i].getFreeSpace()/1073741824);
    	  System.out.println(freeSpace+"GB");
     }
   
     
	}

}
