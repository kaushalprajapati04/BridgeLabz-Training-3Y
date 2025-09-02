import java.util.Scanner;
public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3); 
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }
    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) {
            return "Draw";
        }
        switch (user) {
            case "rock":
                return (comp.equals("scissors")) ? "User" : "Computer";
            case "paper":
                return (comp.equals("rock")) ? "User" : "Computer";
            case "scissors":
                return (comp.equals("paper")) ? "User" : "Computer";
            default:
                return "Invalid"; 
        }
    }
    public static String[][] calculateStats(int userWins, int compWins, int draws, int totalGames) {
        String[][] stats = new String[3][2];
        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (compWins * 100.0) / totalGames;
        double drawPercent = (draws * 100.0) / totalGames;

        stats[0][0] = "User Wins";
        stats[0][1] = userWins + " (" + String.format("%.2f", userPercent) + "%)";
        stats[1][0] = "Computer Wins";
        stats[1][1] = compWins + " (" + String.format("%.2f", compPercent) + "%)";
        stats[2][0] = "Draws";
        stats[2][1] = draws + " (" + String.format("%.2f", drawPercent) + "%)";

        return stats;
    }
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.printf("%-10s %-15s %-15s %-10s\n", "Game", "User Choice", "Computer Choice", "Winner");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-10s %-15s %-15s %-10s\n",
                    gameResults[i][0], gameResults[i][1], gameResults[i][2], gameResults[i][3]);
        }

        System.out.println("\n=== Final Stats ===");
        System.out.printf("%-15s %-15s\n", "Category", "Result");
        System.out.println("----------------------------------");
        for (String[] row : stats) {
            System.out.printf("%-15s %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][] gameResults = new String[n][4];
        int userWins = 0, compWins = 0, draws = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (rock, paper, scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else if (winner.equals("Draw")) draws++;

            gameResults[i][0] = String.valueOf(i + 1);
            gameResults[i][1] = userChoice;
            gameResults[i][2] = compChoice;
            gameResults[i][3] = winner;
        }
        String[][] stats = calculateStats(userWins, compWins, draws, n);
        displayResults(gameResults, stats);

        sc.close();
    }
}
