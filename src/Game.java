import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private static final int MAX_ERRORS = 6;

    private final Dictionary dictionary;
    private String wordToFind;
    private char[] wordFound;
    private int numberOfErrors;
    private ArrayList<String> guessedLetters;

    public Game() {
        dictionary = new Dictionary();
        guessedLetters = new ArrayList<>();
    }

    public void newGame() {
        numberOfErrors = 0;
        guessedLetters.clear();

        wordToFind = dictionary.getRandomWord();
        wordFound = new char[wordToFind.length()];

        wordFound[0] = wordToFind.charAt(0);

        for (int i = 1; i < wordFound.length; i++) {
            wordFound[i] = '_';
        }

        System.out.println("\nHint: the " + dictionary.getCategory()
                + " starts with " + wordToFind.charAt(0));
    }
}
