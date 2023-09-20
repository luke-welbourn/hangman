import java.util.Scanner;

public class Commands {

    private final Scanner scanner = new Scanner(System.in);
    private String[] commands = {"Start Game", "Credits", "Word List", "Quit"  };


    public void setCommands(String[] commands) {
        this.commands = commands;
    }


    public String[] getCommands() {
        return commands;
    }

    public void printCommands() {
        if (commands == null || commands.length == 0) {
            System.out.println("No current commands set");
        } else {
            System.out.println("Please select an option");
            System.out.println();
            for (int i = 0; i < commands.length; i++) {
                System.out.println(i + ": " + commands[i]);
            }
        }
    }

    public int getIntegerInput() {
        System.out.println();
        System.out.print("Enter your choice: ");
        String input = scanner.nextLine().trim();

        while (!input.matches("\\d+")) { // Check if input contains only digits
            System.out.println();
            System.out.println("Input must be a valid number");
            System.out.println();
            System.out.print("Enter your choice: ");
            input = scanner.nextLine().trim();
        }

        int choice = Integer.parseInt(input);

        while (choice < 0 || choice >= commands.length) {
            System.out.println();
            System.out.println("number must be between 0 and " + commands.length);
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
        }
        return choice;
    }

    public void displayCredits() {
        System.out.println();
        System.out.println("Visuals: intelliJ");
        System.out.println();
        System.out.println("Code: Luke Welbourn");
        System.out.println();
        System.out.println("Advice: Ollie Robins & Charlie Richardson");
        System.out.println();
    }

    public void welcome() {
        System.out.println();
        System.out.println("welcome to hangman!");
        System.out.println();
        System.out.println("the rules:");
        System.out.println();
        System.out.println("you get 10 lives, you lose a life with each incorrect guess");
        System.out.println();
        System.out.println("each word contains only letters, so don't try numbers");
        System.out.println();
        System.out.println("if you see a bug in this game, it's an intended feature");
        System.out.println();
        System.out.println("good luck");
        System.out.println();
        System.out.println("press enter to begin  ");
        scanner.nextLine();
    }

    public void displayWin() {
        System.out.println();
        System.out.println("Well done winning the game!");
        System.out.println();
    }

    public void displayLoss() {
        System.out.println();
        System.out.println("The game is now over, better luck next time");
        System.out.println();
    }

    public void displayGoodbye() {
        System.out.println();
        System.out.println("Thank you for visiting!");
    }







}