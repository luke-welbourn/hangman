import java.util.*;

public class Words {

    List<String> words = new ArrayList<>(Arrays.asList(
            "computer", "programming", "java", "hangman", "keyboard",
            "developer", "algorithm", "application", "database", "software",
            "variable", "function", "interface", "object", "inheritance",
            "polymorphism", "encapsulation", "abstraction", "exception", "debugging"
    ));

    int upperLimit = 20;

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
