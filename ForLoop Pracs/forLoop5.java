package forLoopPracs;

import java.util.Scanner;

public class forLoop5 {
// Write a program to convert Hexadecimal to Decimal number System
	public static void main(String[] args) {
		String hexa;
		int des = 0, i, j = 0, len=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Hexadecimal number: ");
		hexa = sc.nextLine();
		len=hexa.length();
		for(i=len-1;i>0;i--)
		{
			if(hexa.charAt(i)>='0' && hexa.charAt(i)<='9')
			{
				des+=((hexa.charAt(i)-48)*Math.pow(16,j));
				j++;
			}
			else if(hexa.charAt(i)>='A' && hexa.charAt(i)<='F')
			{
				des+=((hexa.charAt(i)-55)*Math.pow(16, j));
				j++;
			}
		}
		System.out.println("Decimal value of " + hexa + " = " + des);
		sc.close(); 
	}
}
