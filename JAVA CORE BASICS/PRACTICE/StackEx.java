package core_Java;

import java.util.Stack;

public class StackEx {
  public static void main(String[] args) {
	 Stack<String> name = new Stack<>();// Works on the principle of LIFO i.e Last in First Out 
	 name.push("Abhishek Singh");
	 name.push("Nikhil Singhaniya");
	 name.push("Atif Aslam");
	 System.out.println(name);
	 name.pop();
	 System.out.println(name);
}
}
