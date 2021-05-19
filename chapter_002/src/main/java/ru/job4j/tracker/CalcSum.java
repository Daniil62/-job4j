package ru.job4j.tracker;

import ru.job4j.tracker.component.DaggerInputComponent;
import ru.job4j.tracker.component.InputComponent;

import javax.inject.Inject;

public class CalcSum {
    private final Input input;
    private final Output output;
    @Inject
    public CalcSum(Input input, Output output) {
        this.input = input;
        this.output = output;
    }
    public void calculate() {
        int first = input.askInt("first: ");
        int second = input.askInt("second: ");
        output.printResult(first + second);
    }

    public static void main(String[] args) {
        InputComponent component = DaggerInputComponent.create();
        component.instance().calculate();
    }
}
