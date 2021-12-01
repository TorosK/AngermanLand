import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class player1and2ScoreTest {

    @Test
    void player1ScoreTest() {
        // Test - Checks if the appropriate string is printed out by getP1Score method
        BackEnd test = new BackEnd();
        test.setPlayer1("Julius");
        test.setP1Score(90);
        String result = test.player1Score();

        assertEquals("Player " + test.getPlayer1() + " has score: " + test.getP1Score(), result);
    }

    @Test
    void player2ScoreTest() {
        // Test2 - Checks if the appropriate string is printed out by getP2Score method
        BackEnd test = new BackEnd();
        test.setPlayer2("Ploppan");
        test.setP2Score(50);
        String result = test.player2Score();

        assertEquals("Player " + test.getPlayer2() + " has score: " + test.getP2Score(), result);
    }

    @Test
    void missingPlayer1AndScoreTest() {
        // Test3 - Checks if method still works if "player1" and "P1Score" is undefined
        BackEnd test = new BackEnd();
        String result = test.player1Score();

        assertEquals("Player " + test.getPlayer1() + " has score: " + test.getP1Score(), result);
    }

    @Test
    void missingPlayer2AndScoreTest() {
        // Test4 - Checks if method still works if "player2" and "P2Score" is undefined
        BackEnd test = new BackEnd();
        String result = test.player2Score();

        assertEquals("Player " + test.getPlayer2() + " has score: " + test.getP2Score(), result);
    }

    @Test
    void Player1ZeroScoreTest() {
        // Test5 - Checks if methods still works with score "0"
        BackEnd test = new BackEnd();
        test.setPlayer1("Mackan");
        test.setP1Score(0);
        String result = test.player1Score();

        assertEquals("Player " + test.getPlayer1() + " has score: " + test.getP1Score(), result);
    }

    @Test
    void Player2HundredScoreTest() {
        // Test6 - Checks if methods still works with score "100"
        BackEnd test = new BackEnd();
        test.setPlayer2("Micke");
        test.setP2Score(100);
        String result = test.player2Score();
        assertEquals("Player " + test.getPlayer2() + " has score: " + test.getP2Score(), result);
    }
}