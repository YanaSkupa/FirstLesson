package org.example;

public class FirstLesson {
    public static void main(String[] args) {
        int i = 1;
        long l = 1234;
        double d = 123.23;
        char c = 'A';
        byte b1 = 2;
        short s = 3;
        float f = 665.12f;
        boolean bl = true;
        String A = "AE";
        //
        int a = 10;
        double b = 3.5;
        double sum = a + b;
        System.out.println(sum);
        // a += 5;

        double minus = a - b;
        System.out.println(minus);

        double mnozh = a * b;
        System.out.println(mnozh);

        double dill = a / b;
        System.out.println(dill);

        double rema = a % b;
        System.out.println(rema);
        a++;

        System.out.println(a);
        b--;

        System.out.println(b);
        ////
        String str1 = "Hello";
        String str2 = "World";
        boolean isEqual1 = str1.equals(str2);
        System.out.println("str1 equals str2: " + isEqual1);
        boolean isEqual2 = !str1.equals(str2);
        System.out.println("str1 not equals str2: " + isEqual2);
    }

}