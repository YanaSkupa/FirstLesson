package org.example.exeptionHW.Erth;

public enum Planet {
    MERCURY("Меркурій", 3.3011e23, 5.791e10),
    VENUS("Венера", 4.8675e24, 1.082e11),
    EARTH("Земля", 5.972e24, 1.496e11),
    MARS("Марс", 6.4171e23, 2.279e11),
    JUPITER("Юпітер", 1.8982e27, 7.785e11),
    SATURN("Сатурн", 5.6834e26, 1.427e12),
    URANUS("Уран", 8.6810e25, 2.871e12),
    NEPTUNE("Нептун", 1.02413e26, 4.4987e12);

    private final String name;
    private final double distanceFromSun;
    private final double distanceFromEarth;

    Planet(String name, double distanceFromEarth, double distanceFromSun) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.distanceFromEarth = distanceFromEarth;
    }
    public String getName() {
        return name;
    }
    public double calculateTimeToStopSeeing() {
        double timeToPlanet = distanceFromSun / Constants.SPEED_OF_LIGHT.getValue();
        double timeFromPlanetToEarth = distanceFromEarth / Constants.SPEED_OF_LIGHT.getValue();
        return timeToPlanet + timeFromPlanetToEarth;
    }
}