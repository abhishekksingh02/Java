package core_Java;

public class stringprac {
	public static void main(String[] args) {
		 // Problem: 1
		 String name = " Abhishek Singh";
		 System.out.println(name.toLowerCase());
		 
		 // Problem: 2
		 String text = "Hello this is Abhishek";
		 text = text.replace(" ","_");
		 System.out.println(text);
		 
		 // Problem: 3
		 String letter = "Dear <|name|>, Thanks a lot!";
		 letter = letter.replace("<|name|>","Abhishek Kumar Singh"); 
		 System.out.println(letter);
		 
		 // Problem: 4
		 String myString = "This string contains    double and triple spaces";
		 System.out.println(myString.indexOf("  "));
		 System.out.println(myString.indexOf("   "));
		 
		 // Problem: 5
		 String myLetter = "Dear Abhishek,\nThis Java course is nice.\nThanks!";
		 System.out.println(myLetter);
		 
	}
	

}
