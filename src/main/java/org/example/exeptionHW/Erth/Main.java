package org.example.exeptionHW.Erth;

public class Main {
    public static void main(String[] args) {
        Planet earth = Planet.EARTH;
        double weight = earth.getWeight();
        double timeToStopSeeing = weight / Constants.speedOfLight;

        System.out.println("Час, коли астрономи перестануть бачити планету " + earth.getName() + ": " + timeToStopSeeing + " с");
    }
}
