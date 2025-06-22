package Strings.Level2;
import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rounds do you want to play? ");
        int rounds = sc.nextInt();

        int playerWins = 0, computerWins = 0, ties = 0;

        for (int i = 1; i <= rounds; i++) {
            System.out.print("\nRound " + i + " - Enter rock, paper, or scissors: ");
            String player = sc.next().toLowerCase();
            String computer = getComputerChoice();

            System.out.println("Computer chose: " + computer);
            String result = getWinner(player, computer);

            if (result.equals("Player")) playerWins++;
            else if (result.equals("Computer")) computerWins++;
            else ties++;

            System.out.println("Result: " + result);
        }

        System.out.println("\n===== Final Stats =====");
        System.out.println("Player Wins   : " + playerWins);
        System.out.println("Computer Wins : " + computerWins);
        System.out.println("Ties          : " + ties);

        int totalGames = playerWins + computerWins + ties;
        double playerWinPercent = (playerWins * 100.0) / totalGames;
        double computerWinPercent = (computerWins * 100.0) / totalGames;

        System.out.printf("Player Win %%   : %.2f%%\n", playerWinPercent);
        System.out.printf("Computer Win %% : %.2f%%\n", computerWinPercent);
    }

    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String getWinner(String player, String computer) {
        if (player.equals(computer)) return "Tie";

        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("scissors") && computer.equals("paper")) ||
            (player.equals("paper") && computer.equals("rock"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }
}
