package my_Pack1512;

import java.io.Serializable;

public class GetInput implements Serializable{
       
	String name;
	String Surname;
	String email;
	int password;
	  
	public GetInput(String name,String surname,String email,int password) 
	{
		this.name = name;
		this.Surname = surname;
		this.email =  email;
		this.password = password;
	}
}
