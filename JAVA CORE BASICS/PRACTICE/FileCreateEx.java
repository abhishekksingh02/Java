package core_Java;

import java.io.FileOutputStream;

public class FileCreateEx {
      public static void main(String[] args) {
		 
    	  try
    	  {
    		  String a = "Welcome Abhishek";
    		  FileOutputStream fout = new FileOutputStream("D://abhishek.txt");
    		  fout.write(a.getBytes());
    	  }
    	  catch(Exception e) 
    	  {
    		  System.out.println(e);
    		  
    	  }
    	  System.out.println("Success");
	}
}
