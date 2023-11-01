package org.example.montiHolla;

import java.util.Random;

public class MontiHolla {
    public static void main(String[] args) {
        int totalGames = 1000000;
        int stayWins = 0;
        int switchWins = 0;

        for (int i = 0; i < totalGames; i++) {
            int carPosition = getRandomCarPosition();
            int playerChoice = getRandomPlayerChoice();
            int revealedGoat = getRevealedGoat(carPosition, playerChoice);
            int finalChoiceStay = playerChoice;
            int finalChoiceSwitch = switchChoice(playerChoice, revealedGoat);

            if (finalChoiceStay == carPosition) {
                stayWins++;
            }

            if (finalChoiceSwitch == carPosition) {
                switchWins++;
            }
        }

        double stayWinPercentage = (double) stayWins / totalGames * 100;
        double switchWinPercentage = (double) switchWins / totalGames * 100;

        System.out.println("Wins by staying: " + stayWins + " (" + stayWinPercentage + "%)");
        System.out.println("Wins by switching: " + switchWins + " (" + switchWinPercentage + "%)");
    }

    private static int getRandomCarPosition() {
        Random random = new Random();
        return random.nextInt(3);
    }

    private static int getRandomPlayerChoice() {
        Random random = new Random();
        return random.nextInt(3);
    }

    private static int getRevealedGoat(int carPosition, int playerChoice) {
        Random random = new Random();
        int revealedGoat;

        do {
            revealedGoat = random.nextInt(3);
        } while (revealedGoat == carPosition || revealedGoat == playerChoice);

        return revealedGoat;
    }

    private static int switchChoice(int playerChoice, int revealedGoat) {
        int remainingDoor = 3 - playerChoice - revealedGoat;
        return remainingDoor;
    }
}
