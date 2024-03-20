package JavaPracs;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
        public static void main(String[] args) {
			Set<Integer> set = new HashSet<>();
			// Set interface does not allow duplicate values		
			set.add(22);
			set.add(2);
			set.add(25);
			set.add(22);
			set.add(21);
			
			System.out.println(set);
			
			set.remove(21);
			System.out.println(set);
			
			System.out.println(set.contains(2));
			
			System.out.println(set.size());
			
			set.clear();
			
			System.out.println(set);
			
		}
}
