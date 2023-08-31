package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowerShop {
        public static void main(String[] args) {
            List<Flowers> flowers = new ArrayList<>();
            flowers.add(new Flowers("Rose", 12, 50.0));
            flowers.add(new Flowers("Tulip", 19, 75.0));
            flowers.add(new Flowers("Lily", 2, 12.0));
            flowers.add(new Flowers("Romashka", 19, 5.0));
            flowers.add(new Flowers("Piony", 14, 150.0));

            Customer customer = new Customer(1000.0);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Доступні квіточки:");
                for (Flowers flower : flowers) {
                    System.out.println(flower.getName() + " - " + flower.getQuantity() + " шт. за " + flower.getPrice() + " грн за шт.");
                }

                System.out.print("Яку квіточку бажаєте додати в букет? Введіть назву або 'end' для виходу: ");
                String flowerName = scanner.nextLine();

                if (flowerName.equalsIgnoreCase("end")) {
                    break;
                }

                Flowers chosenFlower = null;
                for (Flowers flower : flowers) {
                    if (flower.getName().equalsIgnoreCase(flowerName)) {
                        chosenFlower = flower;
                        break;
                    }
                }

                if (chosenFlower == null) {
                    System.out.println("Такого виду квіточок немає на прилавку.");
                    continue;
                }

                System.out.print("Скільки штук бажаєте додати в букет? ");
                int quantity = scanner.nextInt();

                double totalPrice = chosenFlower.getPrice() * quantity;
                if (totalPrice > customer.getBudget()) {
                    System.out.println("У вас недостатньо грошиків для покупки.");
                } else if (quantity > chosenFlower.getQuantity()) {
                    System.out.println("На прилавку недостатньо таких квіточок.");
                } else {
                    chosenFlower.reduceQuantity(quantity);
                    customer.deductBudget(totalPrice);
                    System.out.println("Ви додали " + quantity + " шт. квіток " + chosenFlower.getName() + " до букету.");
                }

                scanner.nextLine();
            }

            System.out.println("Ваш бюджет: " + customer.getBudget() + " грн.");
            System.out.println("Дякуємо за покупку!");
        }
    }
