package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int a = rubleToEuro(850);
        System.out.println("850 rubles = " + a + " euro.");
        int b = euroToRuble(85);
        System.out.println("85 euro = " + b + " rubles.");
        int c = rubleToDollar(860);
        System.out.println("860 rubles = " + c + " dollars");
        int d = dollarToRuble(50);
        System.out.println("50 dollars = " + d + " rubles");
    }
}
