package core_Java;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
    	
    	System.out.println("---------- WELCOME TO THE GUESSINNG GAME, ENJOY:) ----------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to play. \nPress 0 to exit. ");
		int user_input = sc.nextInt();
		System.out.println("Enter your lucky number.");
		int luc_num = sc.nextInt();
		
		Random rnd = new Random();
		int computer_input = rnd.nextInt(10);
		
		if(computer_input != luc_num) 
		{
			System.out.println("You Won. Computer lost.");
		}
		else
		{
			System.out.println("Computer wins, great lucky number tho.");
		}
		if(computer_input == 1) {
			System.out.println("System choice is 1.");
		}
		else if(computer_input == 2) {
			System.out.println("System choice is 2.");
		}
		else if(computer_input == 3) {
			System.out.println("System choice is 3.");
		}
		else if(computer_input == 4) {
			System.out.println("System choice is 4.");
		}
		else if(computer_input == 5) {
			System.out.println("System choice is 5.");
		}
		else if(computer_input == 6) {
			System.out.println("System choice is 6.");
		}
		else if(computer_input == 7) {
			System.out.println("System choice is 7.");
		}
		else if(computer_input == 8) {
			System.out.println("System choice is 8.");
		}
		else if(computer_input == 9) {
			System.out.println("System choice is 9.");
		}
		else {
			System.out.println("System choice is 10.");
		}
		
		
		
		sc.close();
	}
}
