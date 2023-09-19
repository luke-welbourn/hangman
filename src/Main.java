

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
                guess.welcome();
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
                if (guess.getNoOfGuesses() <=0) {
                    System.out.println();
                    System.out.println("The game is now over, better luck next time");
                    System.out.println();

                } else {
                    System.out.println();
                    System.out.println("Well done winning the game!");
                    System.out.println();
                }
                guess.clearBoardState();



            } else if (intInput == 1) {
                System.out.println("");
                System.out.println("Visuals: Luke Welbourn");
                System.out.println("");
                System.out.println("Code: Luke Welbourn");
                System.out.println("");
                System.out.println("Humour: Luke Welbourn");
                System.out.println("");
                System.out.println("Advice: Ollie Robins & Charlie Richardson");
                System.out.println("");
            } else if (intInput == 2) {
                System.out.println();
                System.out.println(words.getList());
                System.out.println();
            }
        } while (intInput != 3);
        System.out.println("");
        System.out.println("Thank you for visiting!");

    }
}