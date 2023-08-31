package org.example;

public class Flowers {
    private String name;
    private int quantity;
    private double price;

    public Flowers(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void reduceQuantity(int amount) {
        quantity -= amount;
    }
}
