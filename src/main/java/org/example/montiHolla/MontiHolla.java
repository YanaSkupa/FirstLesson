package org.example.montiHolla;
import java.util.Random;

public class MontiHolla {

    public static void main(String[] args) {
        int totalGames = 1000000;

        int stayWins = 0;
        int switchWins = 0;

        Random random = new Random();

        for (int i = 0; i < totalGames; i++) {
            int carLocation = random.nextInt(3) + 1;
            int playerChoice = random.nextInt(3) + 1;
            int revealedDoor;
            do {
                revealedDoor = random.nextInt(3) + 1;
            } while (revealedDoor == carLocation || revealedDoor == playerChoice);
            if (playerChoice == carLocation) {
                stayWins++;
            }
            int newChoice;
            do {
                newChoice = random.nextInt(3) + 1;
            } while (newChoice == playerChoice || newChoice == revealedDoor);

            if (newChoice == carLocation) {
                switchWins++;
            }
        }
        System.out.println("Підходи, коли гравець залишає свій вибір:");
        System.out.println("Виграв: " + stayWins);
        System.out.println("Програв: " + (totalGames - stayWins));
        System.out.println("% виграшів: " + (stayWins / (double) totalGames * 100) + "%");

        System.out.println("\nПідходи, коли гравець міняє свій вибір:");
        System.out.println("Виграв: " + switchWins);
        System.out.println("Програв: " + (totalGames - switchWins));
        System.out.println("% виграшів: " + (switchWins / (double) totalGames * 100) + "%");
    }
}
