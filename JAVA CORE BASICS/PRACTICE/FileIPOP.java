package core_Java;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIPOP {
    public static void main(String[] args) throws IOException {
		
    	FileOutputStream fout = new FileOutputStream("D://Abhishek.txt");
    	
    	Scanner sc = new Scanner(System.in);
         
    	System.out.println("Please enter your username: ");
    	String name = sc.next();
    	System.out.println("Your username is: "+name);
    	fout.write(name.getBytes());
    	
    	System.out.println("Enter your Password: ");
    	String pass = sc.next();
    	System.out.println("Your Password is: "+pass);
    	fout.write(pass.getBytes());
    	
    	fout.close();
    	
    	FileInputStream fin = new FileInputStream("D://Abhishek.txt");
    	
    	int i=0;
    	 
    	while((i=fin.read())!=-1)
    	{
    		System.out.println(name);
    		System.out.println(pass);
    	}
    	
	}
}
