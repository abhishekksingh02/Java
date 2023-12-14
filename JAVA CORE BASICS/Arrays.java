package core_Java;

public class Arrays {
   public static void main(String[] args) {
// 1)	   int [] marks = new int [5];
	   
// 2) Declaration and memory allocation
//	   int[] marks;
//	   marks =  new int[5];
	   
	   int[] marks = {96,94,85,87,45};
	   
//	   marks[0] = 96;
//	   marks[1] = 94;
//	   marks[2] = 85;
//	   marks[3] = 87;
//	   marks[4] = 45;
	   
//	   System.out.println(marks.length); {gives the length of the Array}
	   
	   // Displaying the Array(Naive way)
	   System.out.println("----------Printing using naive way----------");
	   System.out.println(marks[0]);
	   System.out.println(marks[1]);
	   System.out.println(marks[2]);
	   System.out.println(marks[3]);
	   System.out.println(marks[4]);
	 
	   System.out.println("----------Printing using for loop----------");
	  
	   // Displaying the Array(For loop)
	   for(int i=0; i<marks.length;i++)
	   {
		   System.out.println(marks[i]);
	   }
	   
	   // Displaying the Array in reverse order
	    System.out.println("-----Printing array in reverse order-----");
	    for(int i=marks.length -1 ; i>=0 ; i--) 
	    {
	    	System.out.println(marks[i]);
	    }
	    
	    // Displaying the Array using for-each loop
	    System.out.println("-----Printing array using for-each loop-----");
	    for(int element: marks) {
	    	System.out.println(element);
	    }
	
    }
}
