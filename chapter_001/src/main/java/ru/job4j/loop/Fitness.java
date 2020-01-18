package ru.job4j.loop;

public class Fitness {
    public int training(float vovan, float pavel) {
        int month = 0;
        while (vovan >= pavel) {
            vovan *= 1.1;
            pavel *= 1.2;
            month++;
        }
        return month;
    }
}
