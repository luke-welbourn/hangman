import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordsTest {

    @Test
    @DisplayName("All words are there and correct")
    public void testGetWord() {
        Words words = new Words();

        for (int i = 0; i < 20; i++) {
            String word = words.getWord();

            assertNotNull(word);
            assertTrue(isValidWord(word));
        }
    }

    private boolean isValidWord(String word) {

        String[] validWords = {
                "computer", "programming", "java", "hangman", "keyboard",
                "developer", "algorithm", "application", "database", "software",
                "variable", "function", "interface", "object", "inheritance",
                "polymorphism", "encapsulation", "abstraction", "exception", "debugging"
        };


        for (String validWord : validWords) {
            if (validWord.equals(word)) {
                return true;
            }
        }
        return false;
    }
}