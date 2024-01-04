package core_Java;

import java.io.File;
import java.io.IOException;

public class FileDtl {
     public void getFileDetails(File file) 
     {
    	 System.out.println(file.exists());
    	 System.out.println(file.isDirectory());
    	 System.out.println(file.getName());
    	 System.out.println(file.getAbsolutePath());
    	 System.out.println(file.getPath());
    	 System.out.println(file.canExecute());
    	 System.out.println(file.canRead());
     }
     public static void main(String[] args) throws Exception {
		FileDtl fdl = new FileDtl();
		
		File file = new File("D://Abhishek.txt");
		file.createNewFile();
		fdl.getFileDetails(file);
	}
}
