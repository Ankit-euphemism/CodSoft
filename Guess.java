import java.util.*;

public class Guess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAttempts = 5; // Adjust as desired
        int score = 0;

        do {
            // Generate random number
            int randomNumber = (int) (Math.random() * 100) + 1; // Range 1 to 100
            // Start the guessing loop
            boolean guessed = false;
            int attempts = 0;

            while (!guessed && attempts < maxAttempts) {
                System.out.print("Guess a number between 1 and 100:");
                int guess = scanner.nextInt();
                attempts++;
                if (guess == randomNumber) {
                    guessed = true;
                    score++;
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.Which is:"+randomNumber);
                } else if (guess > randomNumber) {
                    System.out.println("Too high, try again.");
                } else {
                    System.out.println("Too low, try again.");
                }
            }
            // Ask if the user wants to play again
            if (!guessed) {
                System.out.println("You ran out of maxattempts:"+maxAttempts+"\n The number was " + randomNumber + ".");
            }
            System.out.println("Play again? (yes:y/no:n)");
        } while (scanner.next().charAt (0) == 'y');

        System.out.println("Thank you for playing! Your final score is: " + score+"out of:"+maxAttempts);
        scanner.close();
    }
}