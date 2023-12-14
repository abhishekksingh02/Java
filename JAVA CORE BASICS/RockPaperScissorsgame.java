package core_Java;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsgame {
     public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
//		int rock = 0;
//		int paper = 1;
//		int scissor = 2;
		System.out.println("----------WELCOME TO THE ROCK PAPER AND SCISSORS GAME----------");
		System.out.println("----------Welcome user, enjoy the game:)----------");
		System.out.println("Press 0 for Rock\nPress 1 for Paper\nPress 2 for Scissor.");
		Scanner sc = new Scanner(System.in);
		int user_input = sc.nextInt();
		
		Random rnd = new Random();
		int computer_input = rnd.nextInt(3);
		
		if(computer_input == user_input) {
			System.out.println("Match Draw!!!");
		}
		else if(computer_input == 0 && user_input == 1 || computer_input == 1 && user_input == 2 || computer_input == 2 && user_input == 0) {
			System.out.println("You won, computer lose.");
		}
		else
		{
			System.out.println("Computer wins");
		}
		System.out.println("Computer choice is "+ computer_input);
		if(computer_input == 0) {
			System.out.println("Computer choice is Rock.");
		}
		else if(computer_input == 1) {
			System.out.println("Computer choice is Paper.");
		}
		else {
			System.out.println("Computer choice is Scissor.");
		}
		sc.close();
	}
}
