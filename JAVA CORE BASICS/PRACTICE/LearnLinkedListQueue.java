package JavaPracs;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
   public static void main(String[] args) {
	   // Queue works on the principal of FIFO(First in first out)
	   Queue<Integer> queue = new LinkedList<>();
	   
	   queue.offer(12); // "offer" function in queue helps to add elements in queue
	   queue.offer(13);
	   queue.offer(14);
	   queue.offer(15);
	   
	   System.out.println(queue);
	   
	   System.out.println(queue.poll());//"Poll" basically remove the element from the queue and also returns it.
       System.out.println(queue);
       
       System.out.println(queue.peek());// "peek" function in queue basically tell you that which is the next element to get pop from the queue.
       
   
   }
} 
