package core_Java;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {
	 
	    public static void main(String[] args) {

	        System.out.print("Enter your name --> ");
	        Scanner input = new Scanner(System.in);
	        String name = input.nextLine();

	        System.out.printf("So %s how much round you want to play --> \n", name);
	        short number_of_rounds = input.nextShort();

	        System.out.printf("So %s you need to play %d rounds with computer.\n", name, number_of_rounds);

	        System.out.println("Press 1 for Rock.\nPress 2 for Paper.\nPress 3 for Scissor.");

	        short user_score = 0;
	        short computer_score = 0;
	        short number_of_rounds_to_display_user = 1;
	        short user_choice;
	        short computer_choice;
	        String user_choice_string;
	        String computer_choice_string;

	        while (number_of_rounds_to_display_user != (number_of_rounds + 1)) {
	            System.out.printf("\nRound %d\nEnter your choice i.e. 1 for Rock, 2 for Paper, and 3 for Scissor.\n",
	                    number_of_rounds_to_display_user++);
	            user_choice = input.nextShort();
	            computer_choice = (short) ThreadLocalRandom.current().nextInt(1, 4);

	            switch (user_choice) {
	            case 1:
	                user_choice_string = "Rock";
	                break;
	            case 2:
	                user_choice_string = "Paper";
	                break;
	            case 3:
	                user_choice_string = "Scissor";
	                break;

	            default:
	                user_choice_string = "Not a valid choice";
	                break;
	            }

	            switch (computer_choice) {
	            case 1:
	                computer_choice_string = "Rock";
	                break;
	            case 2:
	                computer_choice_string = "Paper";
	                break;
	            case 3:
	                computer_choice_string = "Scissor";
	                break;

	            default:
	                computer_choice_string = "Not a valid choice";
	                break;
	            }

	            // System.out.printf("%s\'s choice is %s and computer choice is %s\n", name,
	            // user_choice_string,
	            // computer_choice_string);

	            if (user_choice == computer_choice) {
	                System.out.println("No one won this turn because both player had chosen " + user_choice_string
	                        + ". Hence this round will be reconsider.");
	                --number_of_rounds_to_display_user;
	            } else if (user_choice == 1) {
	                if (computer_choice == 2) {
	                    // * Computer won
	                    System.out.printf("You lose this turn because\nComputer had chosen %s and you had chosen %s.\n",
	                            computer_choice_string, user_choice_string);
	                    computer_score += 1;
	                }
	                if (computer_choice == 3) {
	                    // * User won
	                    System.out.printf("You won this turn because\nComputer had chosen %s and you had chosen %s.\n",
	                            computer_choice_string, user_choice_string);
	                    user_score += 1;
	                }
	            } else if (user_choice == 2) {
	                if (computer_choice == 1) {
	                    // * User won
	                    System.out.printf("You won this turn because\nComputer had chosen %s and you had chosen %s.\n",
	                            computer_choice_string, user_choice_string);
	                    user_score += 1;
	                }
	                if (computer_choice == 3) {
	                    // * Computer won
	                    System.out.printf("You lose this turn because\nComputer had chosen %s and you had chosen %s.\n",
	                            computer_choice_string, user_choice_string);
	                    computer_score += 1;
	                }
	            } else if (user_choice == 3) {
	                if (computer_choice == 1) {
	                    // * Computer won
	                    System.out.printf("You lose this turn because\nComputer had chosen %s and you had chosen %s.\n",
	                            computer_choice_string, user_choice_string);
	                    computer_score += 1;
	                }
	                if (computer_choice == 2) {
	                    // * User won
	                    System.out.printf("You won this turn because\nComputer had chosen %s and you had chosen %s.\n",
	                            computer_choice_string, user_choice_string);
	                    user_score += 1;
	                }
	            }

	        }
	        System.out.print("\n\n\n\n\n");
	        // * Calculation of the score
	        if (user_score == computer_score) {
	            // * Match is a draw
	            System.out.printf("You both score %d hence match is considered draw\n", computer_score);
	        } else if (user_score > computer_score) {
	            // * User won full match
	            System.out.printf(
	                    "You won the match by %d more score than Computer.\nYours Score is %d and,\nComputer\'s score is %d\n",
	                    (user_score - computer_score), user_score, computer_score);
	        } else {
	            // * Computer won full match
	            System.out.printf(
	                    "You lose the match by %d less score than Computer.\nYours Score is %d and,\nComputer\'s score is %d\n",
	                    (computer_score - user_score), user_score, computer_score);
	        }

	    }

}

