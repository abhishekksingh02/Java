package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.model;

public class Dao {
   public static Connection getconnect()
   {
	   Connection con = null;
	   try 
	   {
		   Class.forName("com.mysql.jdbc.Driver");
		   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root" , "");
		
	   } 
	   catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return con;
   }
   
   // Insert code 
   public static  int insertdata(model m)
   {
	   int status = 0;
	   Connection con = Dao.getconnect();
	   try {
		PreparedStatement ps = con.prepareStatement("insert into info(name, surname, email, pass, mob, hobbies, gender) values(?,?,?,?,?,?,?)");
		
		ps.setString(1, m.getName());
		ps.setString(2, m.getSurname());
		ps.setString(3, m.getEmail());
		ps.setString(4, m.getPass());
		ps.setString(5, m.getMob());
		ps.setString(6, m.getHobbies());
		ps.setString(7, m.getGender());
		
		status = ps.executeUpdate();
	} 
	   catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   return status;
   }
   
   // view Data
   
//   public static int viewdata(model m)
//   {
//	   int status = 0;
//	   
//	   Connnection con = Dao.getconnect();
//	   
//	   return status;
//   }
   
   
}
