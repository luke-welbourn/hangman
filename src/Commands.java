import java.util.Scanner;

public class Commands {

    private final Scanner scanner = new Scanner(System.in);
    private String name = "Commands";
    private String[] commands = {"Start Game", "Credits", "Word List", "Quit"  };

    private void setName(String name) {
        this.name = name;
    }

    private void setCommands(String[] commands) {
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public String[] getCommands() {
        return commands;
    }

    public void printCommands() {
        if (commands == null || commands.length == 0) {
            System.out.println("No current commands set");
        } else {
            System.out.println("Please select an option");
            for (int i = 0; i < commands.length; i++) {
                System.out.println(i + ": " + commands[i]);
            }
        }
    }

    public int getIntegerInput() {
        System.out.print("Enter your choice: ");
        String input = scanner.nextLine().trim();

        while (input.matches("[a-zA-Z]+")) {
            System.out.println();
            System.out.println("input must be a number");
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



    public String getStringInput() {
        System.out.print("Enter your input: ");
        String input = scanner.nextLine();
        while (input.isEmpty()) {
            System.out.println("Input cannot be empty");
            System.out.print("Enter your input: ");
            input = scanner.nextLine();
        }
        return input;
    }







}