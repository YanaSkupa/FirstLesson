package org.example.exeptionHW.Erth;

public enum Constants {
    SPEED_OF_LIGHT(299792458);

    private final double value;

    Constants(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
