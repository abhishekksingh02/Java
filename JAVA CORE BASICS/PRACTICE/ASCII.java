package core_Java;

import java.util.Scanner;

public class ASCII {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character whose ASCII value you want to know: ");
		char ch = sc.next().charAt(0);
		int value = ch;
		System.out.println("Charater is " + ch + " and ASCII value is " + value + ".");
	}

}
