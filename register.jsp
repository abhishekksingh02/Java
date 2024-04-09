<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
   
    <%
	
    String fname=request.getParameter("fullname");  
    String email=request.getParameter("email");  
    String phone=request.getParameter("phone");  
	String pass=request.getParameter("password");
	String repass = request.getParameter("repassword");
	
	if(fname==null||fname.trim().equals(""))
	{
		out.print("<p>Please enter Firstname!</p>");  
	}
	
	if(email==null||email.trim().equals(""))
    {  
    	out.print("<p>Please enter Email!</p>");  
    }
	if(phone==null||phone.trim().equals(""))
	{
		out.print("<p>Please enter Phone!</p>");  
	}
	
	if(pass==null||pass.trim().equals(""))
	{
		out.print("<p>Please enter Password!</p>");  
	}
	if(repass==null||fname.trim().equals(""))
	{
		out.print("<p>Please enter Repassword!</p>");  
	}
	else
	{
		try
    	{  
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webwing","root","");  
    		PreparedStatement ps=con.prepareStatement("select * from users where email=?");  
    		ps.setString(1, email);
    		ResultSet rs=ps.executeQuery();  
      		if(rs.next()) 
      		{      	
      			out.println("<h1>Email Id Already exits, try entering new Email Address.</h1>");   	
    		}
      		else
      		{  
    			out.println("<p>This Email Id Is Available</p>"); 
    			PreparedStatement ps2=con.prepareStatement("insert into users (fullname,email,phone,password) values (?,?,?,?)");
    			ps2.setString(1,fname);
    			ps2.setString(2,email);
    			ps2.setString(3,phone);
      			ps2.setString(4,pass);
    			int data = ps2.executeUpdate();
    		    out.print(data);
    		    
    		    RequestDispatcher rd = request.getRequestDispatcher("EmailSendingServlet");
    		    request.setAttribute("e1", email);
    		    rd.forward(request, response);
    			
    			//response.sendRedirect("signin.jsp");
      		}  
    		con.close();  
    	}
    	catch(Exception e)
    	{
    		out.print(e);
    	}  
	}
%>