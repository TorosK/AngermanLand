import static org.junit.jupiter.api.Assertions.*;

class BackEndGetWinnerTest {

    @org.junit.jupiter.api.Test
    void getCorrectWinner() {
        BackEnd backEndTest = new BackEnd();
        backEndTest.getP1Score(); // måste få ett värde
        String result00 = backEndTest.getWinner();
        assertEquals(105000, result00);
    }
}