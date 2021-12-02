import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class randomStartTest {

    @Test
    void randomStarterTest() {
        //Test1 - If GREEN the random number is either 1 or 2
        BackEnd backend = new BackEnd();
        boolean oneOrTwo = false;
        backend.randomStarter();

        int result = backend.randomStarterForTestOnly(backend.getCurrentPlayer());
        if (result == 1 || result == 2) {
            oneOrTwo = true;
        }
        assertTrue(oneOrTwo);
    }

    @Test
    void randomizerTest() { // Checks if arrayList contains apropriate numbers
        ArrayList<Integer> randomArrayList = new ArrayList<>();
        int result;
        for (int i = 0; i < 25; i++) {
            result = (int) ((Math.random() * 2) + 1);
            randomArrayList.add(result);
        }
        if(randomArrayList.contains(1))
            System.out.println("We have 1's in the ArrayList");
        else
            System.out.println("Error!");
        if(randomArrayList.contains(2))
            System.out.println("We have 2's in the ArrayList");
        else
            System.out.println("Error!");
        int numberOnes = Collections.frequency(randomArrayList, 1);
        int numberTwos = Collections.frequency(randomArrayList, 2);
        System.out.println("There are " + numberOnes + " 1's and " + numberTwos + " 2's");
        /* Om vi har mer tid senare vore det snyggt att beräkna
        hur många procent av 25 som blev ettor respektive tvåor */
        System.out.println("All randomized numbers below: \n");
        System.out.println(randomArrayList.toString());

    }
}