package JavaPracs;

import java.util.Scanner;

public class PallindromeChecker {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=0, c, r;
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		c=n;
		while(n>0)
		{
			r= n%10;
			s= (s*10)+r;
			n= n/10;
		}
		if(c==s)
		{
			System.out.println("Pallindrome Number.");
		}
		else
		{
			System.out.println("Not a pallindrom Number. ");
		}
	}
}
