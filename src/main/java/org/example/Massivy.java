package org.example;

import java.util.Random;

    public class Massivy {
        public static void main(String[] args) {
            int[] numbers = new int[10];
            Random random = new Random();

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
            }

            System.out.println("Числа, які діляться на 2 без остачі:");
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
            }
        }
    }

