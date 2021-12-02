import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ThrowDiceTest {

    @Test
    void throwDiceNumberRangeTest() {  // Makes sure the number generated from "throwDice" is between 1 and 20
        BackEnd test = new BackEnd();
        int[] result = test.throwDiceTest();
        int diceResult = result[0];

        boolean numberIsWithinOneAndTwenty = false;
        assertTrue(diceResult > 0 && diceResult < 21);
    }

    @Test
    void throwDiceRoundCounterIncreaseTest() { // Checks if "roundCounter" goes up by one each time "throwDice" is used
        BackEnd test = new BackEnd();
        int[] result = test.throwDiceTest();
        int roundCounterResult = result[1];
        int[] result2 = test.throwDiceTest();
        int roundCounterSecondResult = result2[1];
        int[] result3 = test.throwDiceTest();
        int roundCounterThirdResult = result3[1];

        assertEquals(1, roundCounterResult);
        assertEquals(2, roundCounterSecondResult);
        assertEquals(3, roundCounterThirdResult);

        System.out.println( "roundCounter is: " + roundCounterResult + "\nroundCounter is: "
                + roundCounterSecondResult
                + "\nroundCounter is: "
                + roundCounterThirdResult );
    }
    @Test
    void diceRandomizerTest(){ // Makes sure that randomized numbers in "throwDice" method all are valid numbers!
        ArrayList<Integer> randomArrayList = new ArrayList<>();
        int result;
        for (int i = 0; i < 1000; i++) {
            result = (int) ((Math.random() * 20) + 1);
            randomArrayList.add(result);
        }
        if(randomArrayList.contains(1))
            System.out.println("We have 1's in the ArrayList");
        else
            System.out.println("Error!");
        if(randomArrayList.contains(20))
            System.out.println("We have 20's in the ArrayList");
        else
            System.out.println("Error!");
        if (randomArrayList.contains(0)){
            System.out.println("Error we have a number zero!");
        }
        if (randomArrayList.contains(21)){
            System.out.println("Error we have a number 21!");
        }

            boolean randomizerWorks = true;
            for (int element : randomArrayList) {
                if (element < 0 || element > 20) {
                    System.out.println("Randomizer is wrong"); //This is printed out IF a wrongful number is generated
                    randomizerWorks = false;
                }
            }
            if (randomizerWorks) {
                System.out.println("Randomizer works fine!"); //Tells tester that all numbers are valid
            }

        int numberOnes = Collections.frequency(randomArrayList, 1);
        int numberTwentys = Collections.frequency(randomArrayList, 20);
        System.out.println("There are " + numberOnes + " 1's and " + numberTwentys + " 20's");
        System.out.println("All randomized numbers below: \n");
        System.out.println(randomArrayList.toString());

    }
}