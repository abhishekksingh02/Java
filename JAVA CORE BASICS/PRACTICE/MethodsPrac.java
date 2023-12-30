package core_Java;

public class MethodsPrac {
//    static void  print_table(int n) {
//    	 for(int i=1 ; i<=10 ; i++) {
//    		 System.out.println(n*i);
//    	 }
//     }
	
	
//	 static void print_pattern1(int n) {
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
//	}
	
	
//	 static int sumRec(int n) {
//		if(n==1) {
//			return 1;
//		}
//		else {
//			return n + sumRec(n-1);
//		}
//	}
	
	
//	static void print_pattern2(int n) {
//		for(int i=1 ; i<=n ; i++) {
//			for(int j=i ; j<=n ; j++) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
//	}
	
	
//	static int fib(int n) {
//		// fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
//		if(n==1) {
//			return 0;
//		}
//		else if(n==2) {
//			return 1;
//		}
//		else {
//			 return fib(n-1) + fib(n-2);
//		}
//	}
	
	
	static float calculate_temp(float c) {
		
		return (c * 9/5) + 32;
	}
	
	
    public static void main(String[] args) {
    	
       // Problem 01:
	   // print_table(7);
	   
	   // Problem 02:
	   //print_pattern1(4);
	   
       // Problem 03:
       // int c = sumRec(5);
       // System.out.println(c);
       
       // Problem 04:
      //print_pattern2(4);
    	
    	//problem 04:
//    	int c= fib(3);
//    	System.out.println(c);
    	
    	// Problem 05:
    	float c = calculate_temp(36);
    	System.out.println("The temperature in fahrenheit is: " + c);
    	
	}
}
