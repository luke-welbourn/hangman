# Hangman Console Game

Welcome to the Hangman Console Game! This project is a simple implementation of the classic Hangman game in the Java
console. It's a great way to practice your Java programming skills while having fun.

## Table of Contents

- [How to Play](#how-to-play)
- [Game Features](#game-features)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [About Me](#about-me)

## How to Play

1. Clone or download this repository to your local machine.

2. Open the project in your favorite Java development environment (e.g., IntelliJ IDEA, Eclipse, or any other).

3. Run the `Main` class to start the game.

4. Follow the on-screen instructions to play the game. Here's a brief overview of the gameplay:

    - You have 10 lives to guess the word.
    - The word to guess is represented by a series of underscores, and you need to guess the letters one by one.
    - Enter a single letter as your guess (no numbers or special characters allowed).
    - If your guess is correct, the letter will replace the underscores in the word.
    - If your guess is incorrect, you will lose a life, and the number of remaining lives will be displayed.
    - Keep guessing until you either correctly guess the word or run out of lives.

## Game Features

- Classic Hangman gameplay.
- Interactive console interface.
- Randomly selected words from a predefined list.
- Clear instructions for new players.
- Visual feedback on the current word and remaining lives.

## Project Structure

The project is organized into several Java classes, each serving a specific purpose:

- `Main.java`: The entry point of the game where you initialize and run the game loop.

- `Words.java`: Contains a predefined list of words for the game. Words are randomly selected from this list.

           List<String> words = new ArrayList<>(Arrays.asList(
            "computer", "programming", "java", "hangman", "keyboard",
            "developer", "algorithm", "application", "database", "software",
            "variable", "function", "interface", "object", "inheritance",
            "polymorphism", "encapsulation", "abstraction", "exception", "debugging"));

- `Guess.java`: Implements the Hangman game logic, including word guessing, life management, and user interactions.

    public void checkUserGuess() {

        System.out.print("Enter a letter: ");
        String input = scanner.nextLine();

        while (input.isEmpty() || input.matches(".*[0-9].*")) {
            System.out.println();
            System.out.println("invalid input");
            System.out.println();
            System.out.print("Enter a letter: ");
            input = scanner.nextLine();
        }

        while (input.length() > 1) {
            System.out.println("Only one letter can be guessed at a time");
            System.out.println();
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

- `Commands.java`: Provides basic command-line interface functionalities for handling user input and displaying
  information.

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

## Getting Started

To run the game on your local machine, follow these steps:

1. Clone the repository to your computer using Git or download it as a ZIP file.

2. Open the project in your Java development environment (e.g., IntelliJ IDEA, Eclipse, or any other).

3. Run the `Main` class to start the game in the console.

4. Follow the on-screen instructions to play the game.

## About-Me

I am a Junior Software Developer on the \_nology program, a comprehensive course that has transformed me into a
full-stack developer. With a passion for creating accessible and user-centric software, I am dedicated to crafting
innovative solutions that address real-world challenges. Through continuous learning and hands-on experience, I am
excited to contribute my skills to the tech industry and create meaningful impact.

