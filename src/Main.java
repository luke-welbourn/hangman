import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Commands commands = new Commands();
        Words words = new Words();
        Guess guess = new Guess();

        int intInput;
        do {
            commands.printCommands();
            intInput = commands.getIntegerInput();

            if (intInput == 0) {
                commands.welcome();
                Collections.shuffle(words.words);
                guess.startCurrent(words.getWord());
                do {
                    System.out.println(guess.getCurrentGuess());
                    System.out.println();
                    guess.checkUserGuess();
                    System.out.println();
                    guess.checkCorrectGuess();
                    System.out.println();
                    guess.finishCheck();

                } while (!guess.finishCheck() && guess.getNoOfGuesses() > 0);
                if (guess.getNoOfGuesses() <= 0) {
                    commands.displayLoss();

                } else {
                    commands.displayWin();
                }
                guess.clearBoardState();


            } else if (intInput == 1) {
                commands.displayCredits();
            } else if (intInput == 2) {
                System.out.println();
                System.out.println(words.getList());
                System.out.println();
            }
        } while (intInput != 3);
        commands.displayGoodbye();

    }
}