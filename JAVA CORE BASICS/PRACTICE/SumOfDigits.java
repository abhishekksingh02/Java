package JavaPracs;

import java.util.Scanner;

public class SumOfDigits {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   int n,sum=0,r = 0;
	   System.out.println("Enter any number");
	   n=sc.nextInt();
	   
	   while(n>0)
	   {
		   r=n%10;
		   sum=sum+r;
		   n=n/10;
	   }
	   System.out.println("Sum of Digits: " + sum);
}
}
