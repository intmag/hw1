package ru.geekbrains.hw1;

public class Main {
    public static void main(String[] args) {
        byte byt = 127;
        short shor = 3276;
        int in = 2147483647;
        long lon = 2147483647;
        float floa = 12.23f;
        double doubl = 12.23;
        char cha = '*';
        boolean boolea = true;
        float a, b, c, d;
        a = 1.0f;
        b = 2.3f;
        c = 5.2f;
        d = 8.01f;
        System.out.println("a * (b + (c / d)) = " + a * (b + (c / d)));
        System.out.println(checkSumm(5, 10));
        checkNum(-3);
        printHello("Евгений");
        System.out.println(checkOnLeapYear(2020));
    }

    public static boolean checkSumm(int a, int b) {
        return (a + b) > 10 && (a + b) <= 20;
    }

    public static void checkNum(int a) {
        if (a < 0) {
            System.out.println("Число: " + a + " - отрицательное.");
        } else {
            System.out.println("Число" + a + " - положительное.");
        }
    }

    public static void printHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static boolean checkOnLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
