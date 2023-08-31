package org.example;

public class Customer {
    private double budget;

    public Customer(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void deductBudget(double amount) {
        budget -= amount;
    }
}
