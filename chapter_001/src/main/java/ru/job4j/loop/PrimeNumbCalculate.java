package ru.job4j.loop;

public class PrimeNumbCalculate {
    public int primeCalc(int finish) {
        int count = 0;
        for(int i = 1; i <= finish; ++i) {
            if(CheckPrimeNumber.check(i)) {
                count ++;
            }
        }
        return count;
    }
}
