package core_Java;

import java.util.Scanner;

public class alphabetconsonent {
         public static void main(String[] args) {
			Scanner sc =  new Scanner(System.in);
			System.out.println("Enter a character");
			char ch = sc.next().charAt(0);
			if(ch == 'a'|| ch == 'e' || ch=='i' || ch=='o' || ch=='u' && ch == 'A' || ch == 'E' || ch=='O' || ch=='U' ) {
				System.out.println(ch+"is a vowel.");
			}
			else if(!((ch>='A'&&ch>='z')||(ch>='a'&&ch<='z'))){
				System.out.println("Invalid input...");
				}
			else
			{
				System.out.println(ch+"is consonant.");
			}
			sc.close();
		}
}
