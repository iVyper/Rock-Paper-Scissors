/*
 * RockPaperScissors.java
 *
 * A simple console-based Rock-Paper-Scissors game.
 * This program lets a user play against the computer.
 * The user inputs their choice, the computer makes a random choice,
 * and the program determines the winner.
 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    // Method to convert numeric choice to corresponding move
    public static String getMoveName(int move) {
        switch (move) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "Unknown";
        }
    }

    // Method to determine the outcome of the game
    public static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a tie!";
        } else if ((userChoice == 0 && computerChoice == 2) ||
                   (userChoice == 1 && computerChoice == 0) ||
                   (userChoice == 2 && computerChoice == 1)) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter 0 for Rock, 1 for Paper, or 2 for Scissors.");
        
        boolean playAgain = true;
        
        while (playAgain) {
            System.out.print("Your choice: ");
            
            // Validate user input
            int userChoice = -1;
            if (scanner.hasNextInt()) {
                userChoice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter 0, 1, or 2.");
                scanner.next(); // Clear invalid input
                continue;
            }
            
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice. Please enter 0, 1, or 2.");
                continue;
            }
            
            int computerChoice = random.nextInt(3);
            
            // Display both choices
            System.out.println("You chose: " + getMoveName(userChoice));
            System.out.println("Computer chose: " + getMoveName(computerChoice));
            
            // Determine and display the winner
            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
            
            // Ask if the user wants to play again
            System.out.print("Play again? (yes/no): ");
            String answer = scanner.next().toLowerCase();
            if (!answer.equals("yes") && !answer.equals("y")) {
                playAgain = false;
            }
            System.out.println();
        }
        
        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}
