package JavaPracs;

import java.util.Scanner;

public class NumerOfDigits {
    public static void main(String[] args) {
		int count =0;
    	Scanner sc = new Scanner(System.in);
    	
       System.out.println("Enter any number: ");
       int n = sc.nextInt();
       
       while(n>0)
       {
    	   n/=10;
    	   count++;
       }
       
       System.out.println("Number of Digits: " + count);
        
	}
}
