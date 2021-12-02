import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class addScoreTest {

    @Test
    void addScoreP1Test() { // Checks if player one has his dice roll added to his 0 score
        BackEnd test = new BackEnd();
        test.setCurrentPlayer(1);
        test.setP1Score(0);

        test.addScoreTest(20,0);
        assertEquals(20, test.getP1Score());
    }

    @Test
    void increaseScoreP1Test() { // Checks if player one has his dice roll added to current score
        BackEnd test = new BackEnd();
        test.setCurrentPlayer(1);
        test.setP1Score(20);

        test.addScoreTest(15,0);
        assertEquals(35, test.getP1Score());
    }

    @Test
    void addScoreWinTest() { // Checks if player one wins when attaining "100" score
        BackEnd test = new BackEnd();
        test.setCurrentPlayer(1);
        test.setP1Score(90);
        test.addScoreTest(10,0);

        String stringResult = test.getWinner();
        assertEquals(100, test.getP1Score());
        assertEquals("And the Winner is " + test.getPlayer1() + " with score: " + test.getP1Score(), stringResult);

    }




}