import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class currentPlayerNameTest {

    @Test
    void currentPlayerName1() { // Checks if correct player is returned depending on value of currentPlayer
        BackEnd test = new BackEnd();

        // Test1 - Checks if player1 is returned
        test.setCurrentPlayer(1);
        String result00 = test.currentPlayerName();
        assertEquals(test.getPlayer1(), result00);

        // Test2 - Checks if player2 is returned
        test.setCurrentPlayer(2);
        String result01 = test.currentPlayerName();
        assertEquals(test.getPlayer2(), result01);

        // Test3 - Checks if proper error message is displayed (testing with "0")
        test.setCurrentPlayer(0);
        String result02 = test.currentPlayerName();
        assertEquals("currentPlayerName Error!", result02);

        // Test4 - Checks if proper error message is displayed (testing with "3")
        test.setCurrentPlayer(3);
        String result03 = test.currentPlayerName();
        assertEquals("currentPlayerName Error!", result03);
    }
}