package my_Pack1512;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
       public static void main(String[] args) throws ClassNotFoundException {
		    try 
		    {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://Details.txt"));
			    GetInput gi = (GetInput) in.readObject();
			    System.out.println("Name: " + gi.name + "\n" + "Surname: " + gi.Surname + "\n" + "Email: " + gi.email + "\n" + "Password: " + gi.password );
		    } 
		    catch (FileNotFoundException e) 
		    {
				
				e.printStackTrace();
			} 
		    catch (IOException e) 
		    {
				
				e.printStackTrace();
			}
	}
}
