package core_Java;

import java.util.Scanner;

public class areaofrect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Width.");
		int a = sc.nextInt();
		System.out.println("Enter the value of Lenght.");
		int b = sc.nextInt();
		float area = a * b;
		System.out.println("Area of Rectangle is: "+ area);
	}

}
