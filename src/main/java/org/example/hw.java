package org.example;

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число 1:");
        double num1 = scanner.nextDouble();

        System.out.println("Введіть символ мат. операції (+, -, *, / або % для ділення з остачею):");
        char operator = scanner.next().charAt(0);

        System.out.println("Введіть число 2:");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            case '%':
                result = modulo(num1, num2);
                break;
            default:
                System.out.println("Недійсний оператор!");
                return;
        }

        System.out.println("Результат операції: " + result);
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
        if (b == 0) {
            System.out.println("Ділення на нуль неможливе!");
            System.exit(0);
        }
        return a / b;
    }

    public static double modulo(double a, double b) {
        if (b == 0) {
            System.out.println("Ділення на нуль неможливе!");
            System.exit(0);
        }
        return a % b;
    }
}

