package core_Java;

import java.util.Scanner;

public class WebsiteDetector {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the website.");
		 String website = sc.next();
		 if(website.endsWith(".org")) {
			 System.out.println("This is an orgranizational website.");
			 
		 }
		 else if(website.endsWith(".com")) {
			 System.out.println("This is a commercial website.");
		 }
		 else {
			 System.out.println("This is an Indian website.");
		 }
		 sc.close();
	}

}
