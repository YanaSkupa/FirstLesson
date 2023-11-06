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
    private final double weight;
    private final double distanceFromSun;

    private static final double SPEED_OF_LIGHT = 299792458.0;

    Planet(String name, double weight, double distanceFromSun) {
        this.name = name;
        this.weight = weight;
        this.distanceFromSun = distanceFromSun;
    }
    public String getName() {
        return name;
    }
    public double calculateTimeToStopSeeing() {
        double lightDelay = 2 * distanceFromSun / SPEED_OF_LIGHT;
        double weightDelay = Math.sqrt(weight) * 1e-8;
        return lightDelay + weightDelay;
    }
}