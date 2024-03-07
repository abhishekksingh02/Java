package JavaPracs;

import java.util.Scanner;

public class PerfectNotPerfect {
    public static void main(String[] args) {
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		n = sc.nextInt();
		
		for(int i=1; i<=n/2; i++)
		{
			if(n%i==0)
			{
				sum = sum+i;
			}
		}
		if(n==sum)
		{
			System.out.println("Entered number is Perfect Number.");
		}
		else
		{
			System.out.println("Entered number is not Perfect Number.");
		}
	}
}
