package forLoopPracs;

import java.util.Scanner;

public class forLoop3 {
// Write a program to convert a binary to decimal number without using array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Number: ");
		int n = sc.nextInt();
		int n1,p=1;
		int dec=0,i=1,j,d;
		n1=n;
		for(j=n; j>0; j=j/10)
		{
			d=j%10;
			  if(i==1)
			  {
				  p=p*1;
			  }
			  else
			  {
				  p=p*2;
			  }
			  
			  dec=dec+(d*p);
			  i++;
		}
//		sc.close();
		System.out.println("Binary Number: "+n1);
        System.out.println("Decimal Number: " +dec);
		}

}
