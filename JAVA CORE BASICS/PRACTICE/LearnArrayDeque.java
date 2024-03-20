package JavaPracs;

import java.util.ArrayDeque;

public class LearnArrayDeque {
       public static void main(String[] args) {
		
    	   ArrayDeque<Integer> adq = new ArrayDeque<>();
    	   
    	   adq.offer(12);
    	   adq.offer(14);
    	   adq.offer(15);
    	   
    	   adq.offerFirst(10);
    	   adq.offerLast(50);
    	   
    	   System.out.println(adq);
    	   
    	   System.out.println(adq.peek());
    	   System.out.println(adq.peekFirst());
    	   System.out.println(adq.peekLast());
    	   
    	   
    	   System.out.println(adq.poll());
    	   System.out.println(adq.pollFirst());
    	   System.out.println(adq.pollLast());
	}
}
