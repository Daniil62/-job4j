package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = true;
        int count = 0;
        for (int i = 1; i <= finish / 2; ++i) {
            if (finish % i == 0) {
                count++;
                if (count >= 2) {
                    prime = false;
                }
            }
        }
            return prime;
    }
}
