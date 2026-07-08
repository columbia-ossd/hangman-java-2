import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repeatYesOrNo;
        int wins = 0;
        int losses = 0;

        do {
            System.out.println("=======================================");
            System.out.println("          Hangman Game");
            System.out.println("=======================================");
            System.out.println("\nLet's guess a Washington State city!");

            Game game = new Game(input);
            game.newGame();
            game.play();
            if (game.wordFound()) {
                wins++;
            } else {
                losses++;
            }
            System.out.println("Scoreboard");
            System.out.println("-----------");
            System.out.println("Games played: " + (wins + losses));
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            System.out.println("-----------");
            do {
                System.out.print("Play again? (y/n): ");
                repeatYesOrNo = input.next().toLowerCase();

            } while (!repeatYesOrNo.equals("y") && !repeatYesOrNo.equals("n"));
        } while (repeatYesOrNo.equals("y"));

        System.out.println("Thanks for playing!");

        input.close();
    }
}