package ru.job4j.oop;

public class Battery {
    private int load;
    public Battery (int load) {
        this.load = load;
    }
    public void exchange(Battery another) {
        another.load = another.load - this.load;
        this.load = this.load + another.load;
    }

    public static void main(String[] args) {
        Battery powerBank = new Battery(100);
        Battery smartphone = new Battery(30);
        System.out.println("powerBank : " + powerBank.load + ". smartphone : " + smartphone.load);
        smartphone.exchange(powerBank);
        System.out.println("powerBank : " + powerBank.load + ". smartphone : " + smartphone.load);
    }
}
