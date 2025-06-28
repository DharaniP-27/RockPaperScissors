import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] options = {"rock", "paper", "scissors"};
        String playAgain;

        System.out.println("Welcome to Rock, Paper, Scissors Game!");

        do {
            System.out.print("\nEnter your choice (rock, paper, scissors): ");
            String playerChoice = sc.next().toLowerCase();

            // Validate input
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid input! Please choose rock, paper, or scissors.");
                continue;
            }

            String computerChoice = options[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            // Determine result
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thank you for playing. Goodbye!");
        sc.close();
    }
}