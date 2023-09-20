import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

class CommandsTest {

//    @BeforeEach
//    void setUp() {
//        Commands commands = new Commands();
//        System.out.println(Arrays.toString(commands.getCommands()));
//    }

    @org.junit.jupiter.api.Test
    @DisplayName("check commands exist")
    void commandsExist_Commands_ReturnTrue() {
        Commands commands = new Commands();
        assertNotNull(commands.getCommands());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("check commands are correct")
    void correctCommands_Commands_ReturnTrue() {
        Commands commands = new Commands();
        assertEquals(Arrays.toString(commands.getCommands()), "[Start Game, Credits, Word List, Quit]");
    }

}