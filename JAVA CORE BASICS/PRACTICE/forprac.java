package core_Java;

import java.util.Scanner;

public class forprac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n.");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i=i+2) {
			System.out.println(i);
//			i = i+2;
//			if(n%2!=0) {
//				System.out.println(i);
			}
		sc.close();
		}
		
	}


