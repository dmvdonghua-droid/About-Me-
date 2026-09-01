import java.util.Scanner;
import java.util.Random;

public class Number_Guessing_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int PlayerChoice;

        do {
            int SecretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean hasWon = false;

            System.out.println("\n========================================");
            System.out.println("I've picked a secret number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");
            System.out.println("========================================");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.println("Attempt " + attempt + "/" + maxAttempts + " : ");
                int guess = input.nextInt();

                if (guess == SecretNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempt + "/" + maxAttempts);
                    hasWon = true;
                    break;
                } else if (guess < SecretNumber) {
                    System.out.println("Hint: higher!");
                } else {
                    System.out.println("Hint: lower!");
                }
            }

            if (!hasWon) {
                System.out.println("\n💥 Game Over! You've used all 7 attempts.");
                System.out.println("The secret number was: " + SecretNumber);
            }

            System.out.println("\nWould you like to play again?");
            System.out.println("1. Start Again");
            System.out.println("2. Quit");
            System.out.print("Enter your choice: ");
            PlayerChoice = input.nextInt();

        } while (PlayerChoice == 1);

        System.out.println("\nThank you for playing! Goodbye!");
        input.close();


    }
}