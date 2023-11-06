package org.example.exeptionHW.Erth;

public class Main {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            double timeToStopSeeing = planet.calculateTimeToStopSeeing();
            System.out.println("Час, коли астрономи перестануть бачити планету " + planet.getName() + ": " + timeToStopSeeing + " секунд.");
        }
    }
}
