package ru.job4j.condition;

public class SqMaxError {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;       // - Было неправильное присвоение (result = third)
                }
            }
        } else if (second > third) {
            if (second > forth) {
                result = second;          // - Было неправильное присвоение (result = first)
            }
        } else if (third > forth) {
            result = third;               // - Было неправильное присвоение (result = second)
        }
        return result;
    }
}
