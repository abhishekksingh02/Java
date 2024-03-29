package emailapp;

import java.util.Scanner;

public class Email {
      private String firstname;
      private String lastname;
      private String password;
      private String department;
      private String email;
      private int mailboxCapacity = 500;
      private int defaultPasswordLength = 10;
      private String alternateEmail;
      private String companySuffix = "ebay.com";
      
      // Constructor to receive the first and last name
      public Email(String firstname, String lastname)
      {
    	  this.firstname = firstname;
    	  this.lastname = lastname;
//    	  System.out.println("EMAIL CREATED: " + this.firstname +" "  + this.lastname);
    	  
    	  // Call a method asking for a department - return the department
    	  this.department = setDepartment();
    	  System.out.println("Department is: " + this.department);
    	  
    	  // Call a method to return a random password
    	  this.password = randomPassword(defaultPasswordLength);
    	  System.out.println("Your Password is: " + this.password);
    	  
    	  // Combine element to generate email
    	  email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department+ "." + companySuffix;
    	  System.out.println("Your Email is: " + email);
    	  
      }
      // Ask for the department
      
      private String setDepartment()
      {
    	  System.out.println("New Worker:" + firstname + "\nEnter the Department Codes: \n1 For sales\n2 For Development\n3 For Accounting\n0 For none.");
    	  Scanner in = new Scanner(System.in);
    	 int depChoice = in.nextInt();
    	 
    	 if(depChoice == 1)
    	 {
    		 return "sales";
    	 }
    	 else if(depChoice == 2)
    	 {
    		 return "Development";
    	 }
    	 else if(depChoice == 3)
    	 {
    		 return "Accounting";
    	 }
    	 else
    	 {
    		 return "None";
    	 }
      }
      
      // Generate a random password
      private String randomPassword(int length)
      {
    	  String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
    	  char[] password = new char[length];
    	  for(int i=0; i<length; i++)
    	  {
    		int rand = (int)(Math.random() * passwordSet.length());
    		password[i] = passwordSet.charAt(rand);
    	  }
    	  return new String(password);
    	  
      }
      // Set the mailbox capacity
      public void setMailboxCapacity(int capacity)
      {
    	  this.mailboxCapacity = capacity;
      }
      // Set an alternate email
       public void setAlternateEmail(String altEmail)
       {
    	   this.alternateEmail = altEmail;
       }
      // Change the password
       public void changePassword(String password)
       {
    	   this.password = password;
       }
       
       public int getMailbocCapacity()
       {
    	   return mailboxCapacity;
       }
       public String getAlternateEmail()
       {
    	   return alternateEmail;
       }
       public String getPassword()
       {
    	   return password;
       }
       public String showInfo()
       {
    	   return "DISPLAY NAME: " + firstname + " " + lastname + 
    			   "\nCOMPANY EMAIL: " + email + 
    			   "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    	   
       }
}
