package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Diapason {
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> array = new ArrayList<>();
        for (int index = start; index != end; index++) {
            array.add(func.apply((double) index));
        }
        return array;
    }
}
