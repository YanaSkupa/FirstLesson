package org.example;

import java.util.Scanner;

public class Kalkulator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть перше число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введіть оператор (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("Введіть друге число: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            if (operator.equals("+")) {
                result = add(num1, num2);
            } else if (operator.equals("-")) {
                result = subtract(num1, num2);
            } else if (operator.equals("*")) {
                result = multiply(num1, num2);
            } else if (operator.equals("/")) {
                result = divide(num1, num2);
            } else {
                System.out.println("Непідтримуваний оператор");
                return;
            }

            System.out.println("Результат: " + result);
        }

        public static double add(double a, double b) {
            return a + b;
        }

        public static double subtract(double a, double b) {
            return a - b;
        }

        public static double multiply(double a, double b) {
            return a * b;
        }

        public static double divide(double a, double b) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Ділення на нуль неможливе");
                return Double.NaN;
            }
        }
    }
