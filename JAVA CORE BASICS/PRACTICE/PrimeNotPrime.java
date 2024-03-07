package JavaPracs;

import java.util.Scanner;

public class PrimeNotPrime {
      public static void main(String[] args) {
		int n,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Entered number is Prime Number.");
		}
		else
		{
			System.out.println("Entered number is not Prime Number.");
		}
	}
}
