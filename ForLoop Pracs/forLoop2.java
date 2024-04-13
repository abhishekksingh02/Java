package forLoopPracs;

import java.util.Scanner;

public class forLoop2 {
	// Write a java program to display the largest 
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n;
		 int max = Integer.MIN_VALUE;
		 int min = Integer.MAX_VALUE;
		 char choice;
		 
		 do
		 {
			 System.out.println("Enter the nuber: ");
			 n = sc.nextInt();
			 if(n>max)
			 {
				 max = n;
			 }
			 if(n<min)
			 {
				 min = n;
			 }
			 
			 System.out.println("Do you want to continue y/n ? :");
			 choice = sc.next().charAt(0);
		 }while(choice=='y' || choice=='Y');
		 System.out.println("Largest number: " + max);
		 System.out.println("Smallest number: " + min);
		 
//		 System.out.println("Enter value: ");
//		 int n = sc.nextInt();
//		 
//		 for(int i=1;i<=n;i++)
//		 {
//			 System.out.println(i);
//		 }
		 sc.close();
	}
   
    
  
}
