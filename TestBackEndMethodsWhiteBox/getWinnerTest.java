import static org.junit.jupiter.api.Assertions.*;

class getWinnerTest {

    @org.junit.jupiter.api.Test
    void getP1Winner() {  // Method checks if Player one successfully wins with a higher end score
        BackEnd backEndTest = new BackEnd();
        backEndTest.setP1ScoreTest(100);
        backEndTest.setP2ScoreTest(90);

        String result00 = backEndTest.getWinner();
        assertEquals("And the Winner is " + backEndTest.getPlayer1() +
        " with score: " + 100, result00);
    }

    @org.junit.jupiter.api.Test
    void getP2Winner() {  // Method checks if Player two successfully wins with a higher end score
        BackEnd backEndTest = new BackEnd();
        backEndTest.setP1ScoreTest(90);
        backEndTest.setP2ScoreTest(100);

        String result00 = backEndTest.getWinner();
        assertEquals("And the Winner is " + backEndTest.getPlayer2() +
                " with score: " + 100, result00);
    }


    @org.junit.jupiter.api.Test
    void getDraw() {  // Method checks if nobody successfully wins if both scores are too low
        BackEnd backEndTest = new BackEnd();
        backEndTest.setP1ScoreTest(90);
        backEndTest.setP2ScoreTest(80);

        String result00 = backEndTest.getWinner();
        assertEquals("Draw!", result00);
    }

    @org.junit.jupiter.api.Test
    void getTwo100Plus() {  /* Method checks what hypothetically happens if two players
        have a greater score than 100 or both win at 0 points! */
        BackEnd backEndTest = new BackEnd();
        backEndTest.setP1ScoreTest(110);
        backEndTest.setP2ScoreTest(100);

        String result00 = backEndTest.getWinner();
        assertEquals("Draw!", result00);

        backEndTest.setP1ScoreTest(0);
        backEndTest.setP2ScoreTest(0);

        String result01 = backEndTest.getWinner();
        assertEquals("Draw!", result01);
    }
}