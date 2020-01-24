package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double bc, double ca) {
        return ab + bc > ca && bc + ca > ab && ab + ca > bc ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(Triangle.exist(6, 5.5, 9));
    }
}
