package forLoopPracs;

import java.util.Scanner;

public class forLoop4 {
// Write a program to check whether a number is a Strong Number or not 
// 145 = 1! + 4! + 5! = 1 + 24 + 120 = 145 so we can say that 145 is Strong number.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether the number is Stron number or not: ");
		int n = sc.nextInt();
		
		int i,n1,s1=0,j;
		
		int fact;
		
		n1 = n;
		for(j=n;j>0;j=j/10)
		{
			fact = 1;
			for(i=1;i<=j%10;i++)
			{
				fact = fact * i;
			}
			s1 = s1 + fact;
		}
		if(s1==n1)
		{
			System.out.println("Strong Number: " + n1);
		}
		else
		{
			System.out.println("Not Strong Number: "+n1);
		}
		
		sc.close();
	}
}
