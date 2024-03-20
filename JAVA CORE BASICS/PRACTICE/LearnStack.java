package JavaPracs;

import java.util.Stack;

public class LearnStack {
   public static void main(String[] args) {
	 Stack< String > animals =  new Stack<>();
	 // Stack work on LIFO(Last in first out) algorithm We use push method to give values while dealing with stack
	 animals.push("Lion");
	 animals.push("Elephant");
	 animals.push("Dog");
	 animals.push("Elephant");
	 
	 System.out.println("Stack: " + animals);
	 
	 System.out.println(animals.peek());// Peek Function will tell which value is on top.
	 
	 animals.pop();
	 
	 System.out.println(animals.peek());
}
}
