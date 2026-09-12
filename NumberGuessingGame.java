import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

         System.out.println("=======================================");
         System.out.println(" Welcome to the Number Guessing Game!");
         System.out.println("=======================================");

        boolean playAgain = true;

        while (playAgain) {
            int lowerBound = 1;
            int upperBound = 100;
            int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int maxAttempts = 7;
            int attemptsUsed = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nI'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess it. Good luck!\n");

            while (attemptsUsed < maxAttempts && !guessedCorrectly) {
                System.out.print("Attempt " + (attemptsUsed + 1) + "/" + maxAttempts + " - Enter your guess: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("That's not a valid number. Try again.");
                    scanner.next(); // discard invalid input
                    continue;
                }

                int guess = scanner.nextInt();
                attemptsUsed++;

                if (guess < lowerBound || guess > upperBound) {
                    System.out.println("Please guess a number within the range " + lowerBound + "-" + upperBound + ".");
                } else if (guess < secretNumber) {
                    System.out.println("Too low!");
                } else if (guess > secretNumber) {
                    System.out.println("Too high!");
                } else {
                    guessedCorrectly = true;
                    System.out.println("Correct! You guessed the number in " + attemptsUsed + " attempt(s).");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The number was: " + secretNumber);
            }

            System.out.print("\nWould you like to play again? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
        }

        System.out.println("\nThanks for playing! Goodbye.");
        scanner.close();
    }
}
