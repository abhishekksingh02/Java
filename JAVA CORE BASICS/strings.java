package core_Java;

public class strings {
  public static void main(String[] args) {
	String name = "Abhishek";
	System.out.println(name.length());// Returns the length of the string
	System.out.println(name.toLowerCase());// Convert uppercase letters to lowercase letter.
    System.out.println(name.toUpperCase());// Convert string into uppercase.
    System.out.println(name.trim());// Trims extra spaces.
    System.out.println(name.substring(6));// Returns a substring from start to the end.
    System.out.println(name.substring(4, 8));//Returns a substring from start index to the end index. Start index is included and end is excluded.
    System.out.println(name.replace("h", "e"));// Returns a new string after replacing h with e.
    System.out.println(name.startsWith("zi"));// Returns true if name starts with string "zi" false in this case.
    System.out.println(name.endsWith("zen"));// Returns true if name ends with string "zen". False in this case.
    System.out.println(name.charAt(1));// Returns character at a given index position.
    System.out.println(name.indexOf("is"));// Returns the index of the given string.
    System.out.println(name.indexOf("s",3));// Returns the index of given string starting from 3.
    System.out.println(name.lastIndexOf("h"));// Returns the last index of the given string.
    System.out.println(name.lastIndexOf("k",2));// Returns the last index of the given string before index 2.
    System.out.println(name.equals("Abhishek"));// Returns true if the given string is equal to "Abhishek", false otherwise. True in this case.
   
  }
}
