package core_Java;

import java.util.LinkedList;

public class LinkedListEx {
   public static void main(String[] args) {
	LinkedList<String> name = new LinkedList<String>();
	
	name.add("Abhishek Singh");
	System.out.println(name);
	name.addFirst("Rohit Singh");
	System.out.println(name);
	name.addLast("Amir Khan");
	System.out.println(name);
	name.add(1, "Anish Singh");
	System.out.println(name);
	name.removeFirst();
	System.out.println(name);
}
}
