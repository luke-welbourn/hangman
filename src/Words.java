import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Words {

    private static final List<String> words = new ArrayList<>();

    int upperLimit = 20;

    static {
        words.add("computer");
        words.add("programming");
        words.add("java");
        words.add("hangman");
        words.add("keyboard");
        words.add("developer");
        words.add("algorithm");
        words.add("application");
        words.add("database");
        words.add("software");
        words.add("variable");
        words.add("function");
        words.add("interface");
        words.add("object");
        words.add("inheritance");
        words.add("polymorphism");
        words.add("encapsulation");
        words.add("abstraction");
        words.add("exception");
        words.add("debugging");

        // Shuffle the words to randomize the order
        Collections.shuffle(words);
    }

    public String getWord() {
        upperLimit -= 1;
        return words.get(upperLimit);
    }

    public String getList() {
        StringBuilder wordList = new StringBuilder("List of Words:\n");

        for (String word : words) {
            wordList.append(word).append("\n");
        }

        return wordList.toString();
    }

}
