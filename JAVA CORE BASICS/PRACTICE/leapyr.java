package core_Java;

import java.util.Scanner;

public class leapyr {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any year.");
	int year = sc.nextInt();
	if(year%4==0)
	{
		System.out.println("Entered year is Leap year.");
	}
	else
	{
		System.out.println("Entered year is not a Leap year.");
	}
	sc.close();
   }
 
}
