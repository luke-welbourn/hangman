import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guess {

    private Scanner scanner = new Scanner(System.in);

    private ArrayList currentGuess = new ArrayList();
    private ArrayList currentWord = new ArrayList();

    private int noOfGuesses = 10;
    private boolean correctGuess = false;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public void setCurrentGuess(ArrayList currentGuess) {
        this.currentGuess = currentGuess;
    }

    public void setCurrentWord(ArrayList currentWord) {
        this.currentWord = currentWord;
    }


    public void alterCurrentGuess(ArrayList currentGuess, int index, char mod) {
        currentGuess.set(index, mod);
    }

    public void checkCorrectGuess() {
        if (!correctGuess) {
            noOfGuesses -= 1;
            System.out.println("Bad luck, " + noOfGuesses + " guesses remaining");
        } else {
            System.out.println("Nice one, " + noOfGuesses + " guesses remaining");
            correctGuess = false;
        }

    }

    public String startCurrent(String word) {


        for (int i = 0; i < word.length(); i++) {

            currentGuess.add(" _ ");
            currentWord.add(word.charAt(i));
        }
        return currentGuess.toString();

    }

    public String getCurrentGuess() {
        String toUser = "";
        for (int i = 0; i < currentGuess.size(); i++) {
            toUser += currentGuess.get(i);
        }
        return toUser;
    }

    public String getCurrentWord() {
        String toUser = "";
        for (int i = 0; i < currentWord.size(); i++) {
            toUser += currentWord.get(i);
        }
        return toUser;
    }



    public void welcome() {
        System.out.println("");
        System.out.println("welcome to hangman!");
        System.out.println("");
        System.out.println("the rules:");
        System.out.println("");
        System.out.println("you get 10 lives, you lose a life with each incorrect guess");
        System.out.println("");
        System.out.println("each word contains only letters, so don't try numbers");
        System.out.println("");
        System.out.println("if you see a bug in this game, it's an intended feature");
        System.out.println("");
        System.out.println("good luck");
        System.out.println("");
        System.out.println("press enter to begin");
        String input = scanner.nextLine();

    }

    public boolean finishCheck() {

        String elementToCheck = " _ ";

        String stringToCheck = " _ ";

        return !getCurrentGuess().contains(stringToCheck);
        // code simplified by itelliji

    }

    public void checkUserGuess() {
        System.out.print("Enter a letter: ");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            System.out.println("No guess detected");
            System.out.print("Enter a letter: ");
            input = scanner.nextLine();
        } else if (input.length() > 1) {
            System.out.println("Only one letter can be guessed at a time");
            System.out.print("Enter a letter: ");
            input = scanner.nextLine();
        }

        for (int i = 0; i < (getCurrentWord()).length(); i++) {

            if (getCurrentWord().charAt(i) == input.charAt(0)) {
                alterCurrentGuess(currentGuess, i, input.charAt(0));
                correctGuess= true;
            }

        }
    }

    public void clearBoardState() {
        setNoOfGuesses(10);
        currentGuess.clear();
        currentWord.clear();
    }
}
