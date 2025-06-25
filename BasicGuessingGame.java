
import java.util.*;

public class BasicGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {
            int number = r.nextInt(100) + 1;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("Guess a number between 1 and 100. You have 5 tries!");

            while (attempts < 5 && !guessed) {
                System.out.print("Enter your guess: ");
                
                if (!sc.hasNextInt()) {
                    System.out.println("Enter a valid number!");
                    sc.next(); 
                    continue;
                }

                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("You guessed it right! 🎉");
                    guessed = true;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessed) {
                System.out.println("The number was: " + number);
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = sc.next();
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}