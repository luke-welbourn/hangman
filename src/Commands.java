import java.util.Scanner;

public class Commands {

    private final Scanner scanner = new Scanner(System.in);
    private String name = "Commands";
    private String[] commands = {"Start Game", "Credits", "Quit"  };

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
        String input = scanner.nextLine();

        while (Integer.parseInt(input) < 0 || Integer.parseInt(input) >= commands.length) {
            System.out.println("That is not a valid input");
            System.out.print("Enter your choice: ");
            input = scanner.nextLine();
        }
        return Integer.parseInt(input);
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