package my_Pack1512;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args)  {
		
	   try
      {
			
    	GetInput gi = new GetInput("Abhishek","Singh","abhishek4@gmail.com",1234);
		FileOutputStream fout = new FileOutputStream("D://Details.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(gi);
	  }
    catch (Exception e) 
      {
		e.printStackTrace();
	  }
		System.out.println("Success.");
}
}
