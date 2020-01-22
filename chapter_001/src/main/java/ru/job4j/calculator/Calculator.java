package ru.job4j.calculator;

public class Calculator {
    public static void div (double first, double second) {
        double result = first/second;
        System.out.println(first + " / " + second + " = " + result);
    }
    public static void multiply (double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }
    public static void subtract (double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }
    public static void main(String[] args) {
        div(10.4,5.2);
        multiply(2.5,5.2);
        subtract(8.35,5.21);
    }
  }

