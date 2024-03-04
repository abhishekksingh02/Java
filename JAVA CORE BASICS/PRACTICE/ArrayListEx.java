package core_Java;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Abhsihek Singh");
		name.add("Ankush");
		name.add("Nikhil");
		System.out.println(name);
		
		name.add("Anish");
		System.out.println("Array after adding new name");
		System.out.println(name);
		
		name.add(1, "Anshu Singh");
		System.out.println("Array after adding new name at index one.");
		System.out.println(name);
		name.remove(0);
		System.out.println("Array after removing index zeroth name.");
		System.out.println(name);
		name.clear();
		System.out.println(name);
		}
  
}
