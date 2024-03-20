package JavaPracs;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
    	
    	// Linked Hash Set maintains the insertion order
//		Set<Integer> set = new LinkedHashSet<>();
    	Set<Integer> set = new TreeSet<>();
		
		set.add(23);
		set.add(24);
		set.add(34);
		
		System.out.println(set);
	}
}
