package ru.job4j.condition;

public class SqMaxError {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;      // - Было неправильное присваивание (result = third).
                }
            }
        } else if (second > third) {
            if (second > forth) {
                result = second;         // - Было неправильное присваивание (result = first).
            }
        }
        if (third > forth && third > second && third > first) { // - Изменено условие и убран оператор else.

            result = third;              // - Было неправильное присваивание (result = second).
        }
        return result;
    }
}
