package core_Java;

public class Recursion {
	static int factorial(int n) {
		// factorial of 0 is 1;
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
		
}

	public static void main(String[] args) {
		int n = 0;
		System.out.println("The value of Factorial n is: " + factorial(n));
	}
 }