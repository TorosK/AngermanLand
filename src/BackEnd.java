import javax.swing.*;
import java.util.Random;

public class BackEnd {
    private String player1; //Namnet på den ena spelaren
    private String player2; //Namnet på den andra spelaren
    private int p1Score;    //Spelare1:s poäng
    private int p2Score;  //Spelare2:s poäng
    private int dice;     //"Tärningens värde"
    private int currentPlayer; // En flagga. Om det är spelare1s tur är den annars 2.
    private int roundCounter; // Räknare som håller ordning på antalet kast per spelomgång
    private boolean gameOver = false;  //Sätts till true när någon spelare vinner

    //Det finns inget skäl att ändra i konstruktorn eller i instansvariablerna
    public BackEnd (){
        this.player1="";
        this.player2="";
    }

    //Ska returnera en sträng: "And the Winner is " samt namnet på den spelare som har högst poäng
    public String getWinner(){
        //DONE!
        if (getP1Score() >= 100 && getP1Score() > getP2Score() && getP2Score() < 100) {
            return "And the Winner is " + getPlayer1() + " with score: " + getP1Score();
        }
        else if (getP2Score() >= 100 && getP2Score() > getP1Score() && getP1Score() < 100) {
            return "And the Winner is " + getPlayer2()  + " with score: " + getP2Score();
        }
        else {
            return "Draw!";
        }

    }

    // Ska returnera namnet på den spelaren i tur utifrån värdet på currentplayer
    public String currentPlayerName(){
        //Done
        if (getCurrentPlayer() == 1){
            return getPlayer1();
        }
        else if (getCurrentPlayer() == 2){
            return getPlayer2();
        }
        else{
            return "currentPlayerName Error!";
        }
    }

    //Sätter this.currentPlayer till 1 eller 2 baserat på slumpen.
    public void randomStarter(){
        //TODO
    }

    // ******************************************** Test version ***********************************************
    //This is a test version of "randomStarter" method that also returns this.currentPlayer
    public int randomStarterForTestOnly(int currentPlayer){
        this.currentPlayer = currentPlayer;
        Random random = new Random();
        int result = (int) (( Math.random() * 2) + 1); // randomly assigns either 1 or 2 to result
        this.currentPlayer = result;
        return this.currentPlayer;
    }
    // *********************************************************************************************************



    //Returnerar en sträng med spelare1:s namn följt av "Score: " samt spelare1:s poäng
    public String player1Score(){
        //TODO
        return "Not implemented";

    }
    //Returnerar en sträng med spelare2:s namn följt av "Score: " samt spelare2:s poäng
    public String player2Score(){
        //Done!
        return "Player " + getPlayer2() + " has score: " + getP2Score();
    }

    //Ger this.Dice ett värde mellan 1 och 20, samt ökar this.roundCounter med 1;
    public void throwDice(){
        //TODO
    }

    // Testversion of thowDice that should be deleted before product launch
    public int[] throwDiceTest(){
        //DONE!
        this.dice = getDice();
        this.dice = (int) (( Math.random() * 20) + 1);
        this.roundCounter = getRoundCounter();
        this.roundCounter++;
        int[] diceAndRoundCounter = {this.dice, this.roundCounter};

        return diceAndRoundCounter;
    }


    // Lägger till värdet på this.dice till den aktuelle spelarens poäng
    // Nollställer därefter this.dice och this.roundCounter
    // Kollar sedan om någon av spelarna har nått 100 poäng och om så är fallet sätts gameOver till true
    public void addScore(){
        //DONE!
        this.dice = getDice();
        this.roundCounter = getRoundCounter();

        if (getCurrentPlayer() == 1){
            setP1Score(getP1Score() + this.dice);
        }
        else if (getCurrentPlayer() == 2){
            setP2Score(getP2Score() + this.dice);
        }

        this.dice = 0;
        this.roundCounter = 0;
        getWinner();
    }

    public void addScoreTest(int dice, int roundCounter){ // Duplicated method added for testing purposes
        //DONE!
        this.dice = dice;
        this.roundCounter = roundCounter;

        if (getCurrentPlayer() == 1){
            setP1Score(getP1Score() + this.dice);
        }
        else if (getCurrentPlayer() == 2){
            setP2Score(getP2Score() + this.dice);
        }

        this.dice = 0;
        this.roundCounter = 0;
        getWinner();
    }


//Inget ska behöva ändras eller testas koden härunder

    public void startGame(String p1, String p2){
        this.gameOver = false;
        this.player1 = p1;
        this.player2 = p2;
        this.p1Score = 0;
        this.p2Score = 0;
        this.currentPlayer = 1;
    }

    public void askToKeep() {
        if (this.roundCounter <3) {
            int reply = JOptionPane.showConfirmDialog(null, "Roll again?" , this.player1, JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.NO_OPTION) {
                addScore();
            }else {return;}
        } else{
            addScore();
        }
    }

    public String getPlayer1() {
        return player1;
    }
    public String getPlayer2() {
        return player2;
    }


    public int getP1Score() {
        return p1Score;
    }

    public int getP2Score() {
        return p2Score;
    }

    public void setP1Score(int p1Score) {
        this.p1Score = p1Score;
    }

    public void setP2Score(int p2Score) {
        this.p2Score = p2Score;
    }

    // ********************************** Testing purposes ***********************************
    // Setters created for testing and bugfix

    public void setPlayer1Test(String player1) {
        this.player1 = player1;
    }

    public void setPlayer2Test(String player2) {
        this.player2 = player2;
    }

    public void setCurrentPlayer(int currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public void setRoundCounterTest(int roundCounter) {
        this.roundCounter = roundCounter;
    }

    public void setDiceTest(int dice) {
        this.dice = dice;
    }

    // ***************************************************************************************

    public int getRoundCounter() {
        return roundCounter;
    }

    public int getCurrentPlayer(){
        return this.currentPlayer;
    }
    public int getDice(){
        return this.dice;

    }
    public boolean gameOver(){
        return this.gameOver;
    }

}
