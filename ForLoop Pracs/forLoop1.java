package forLoopPracs;

public class forLoop1 {
 // Write a program to find the number and sum of all integers between 100 and 200 which is divisible by 9
 public static void main(String[] args) {
	 int sum = 0;
	 System.out.println("Numbers between 100 to 200 whhic are divisible by 9 are: ");
	 for(int i=100;i<=200;i++)
	 {
		 if(i%9==0)
		 {
			 System.out.println(i);
			 
			 sum = sum+i;
			 
		 }
	 }
	 System.out.println("Addition of each number which are divisible by 9 between 100 and 200: " + sum);
  }
}
