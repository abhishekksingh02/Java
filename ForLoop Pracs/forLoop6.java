package forLoopPracs;

public class forLoop6 {
	// below are the set of tricky code snippets related to forLoop, whileLoop, doWhileLoop
     public static void main(String[] args) {
	     // 1) it will print "Hello" only one time as break will terminate the current loop
    	 for(int i=0;i<5;i++)
    	 {
    		 System.out.println("Hello");
    		 break;
    	 }
    	 
         System.out.println("*--------------------*");
         
         // 2) It will print "Hello" three times because i is incremented 2 times for one iteration
         for(int i=0;i<5;i++)
         {
        	 System.out.println("Hello");
        	 i++;
         }
         
         System.out.println("*--------------------*");
         
         // 3) It will print "Hello" five times because i++; will increement the value of i by 1 but in next statement i--; will decreement the value of i by 1.
         for(int i=0;i<5;i++)
         {
        	 System.out.println("Hello");
        	 i++;
        	 i--;
         }
         
         System.out.println("*--------------------*");
         
         //4) It will print "Hello" two times, as the loop is executed 2 times only because i is incremented by 3 everytime.
         for(int i=0;i<5;i++)
         {
        	 System.out.println("Hello");
        	 i+=2;
         }
         
         System.out.println("*--------------------*");
         
         //5) It will print "Hello" two times as the for loop will run two times only for i=0;i=4
         for(int i=0;i<5;i+=2)
         {
        	 System.out.println("Hello");
        	 i+=2;
         }
         
         System.out.println("*--------------------*");
         
         //6) It will "Hello" infinite times as there isnt any increment or decrement 
//         for(int i=0;i<5;)
//         {
//        	 System.out.println("Hello");
//         }
         
         System.out.println("*--------------------*");
         
         //7) Nothing will print because loop will not run
         for(int i=0;i>5;)
         {
        	 System.out.println("Hello");
         }
         
         System.out.println("*--------------------*");
         
         //8) "Hello" will be printed only once because second time value of i becomes 5 that why 5<5 which is false condition.
         for(int i=0;i<5;i=5)
         {
        	 System.out.println("Hello");
         }
         
         System.out.println("*--------------------*");
         
         //9) It will print "fr" as respect to the condition
         String s = "friends";
         int x =0;
         
         do
         {
        	 System.out.println(s.charAt(x));
        	 x++;
         }while(x<2);
         
         System.out.println("*--------------------*");
         
         //10) It will print "Abhishek" infinite times
//         while(true)
//         {
//        	 System.out.println("Abhishek");
//         }
         
         System.out.println("*--------------------*");
         
         // 11) It will print "Abhishek" one time
         for(int i=0;i<5;i++);
         {
        	 System.out.println("Abhishek");
         }
         
    	 
    	 
	}
}
