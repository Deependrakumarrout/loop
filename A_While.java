package Loop;

import java.util.Random;
public class A_While {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int rollDice = randomGenerator.nextInt(6) + 1;
        System.out.println(rollDice);


        // This while loop will repeat util and unless when the 5 comes as a random number to the rollDice then only
        // it will come out from the loop.
        // If the number will be not equal to 5 then the loop will repeat again and again. Until and condition get false.
        while(rollDice!=5) {
            rollDice = randomGenerator.nextInt(6) + 1;
            System.out.println(rollDice);
        }
    }
}
