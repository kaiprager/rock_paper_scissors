package rock_paper_scissors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GameLogic gameLogic = new GameLogic();

        String playAgain;

        System.out.println("ROCK ::: PAPER ::: SCISSORS");
        System.out.println();

        do {
            int selection = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.println("Please select Rock(1), Paper(2), or Scissors(3): ");
                    selection = scanner.nextInt();
                    scanner.nextLine(); 

                    if (selection < 1 || selection > 3) {
                        System.err.println("Invalid Input.");
                    } else {
                        validInput = true;
                    }

                } catch (InputMismatchException e) {
                    System.err.println("Invalid Input. Please enter a number.");
                    scanner.nextLine(); 
                }
            }

            String gameResult = gameLogic.playing(selection);
            System.out.println(gameResult); 

            System.out.println();
            System.out.println("Do you want to play again (y/n)? ");

            boolean validChoice = false;
            do {
                playAgain = scanner.nextLine();

                if (playAgain.equalsIgnoreCase("n")) {
                    System.out.println("I'm sorry that you are leaving.");
                    System.out.println("I hope to see you again soon.");
                    validChoice = true; 
                } else if (playAgain.equalsIgnoreCase("y")) {
                    validChoice = true; 
                } else {
                    System.err.println("Invalid Input. Please enter 'y' or 'n'.");
                }
            } while (!validChoice); 

        } while (playAgain.equalsIgnoreCase("y")); 

        scanner.close();
    }
}
