package ru.job4j.oop.poly;

public class Bus implements Transport {

    @Override
    public void ride() {
        System.out.println("Bus from Ryazan to Kolomna.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("there are " + count + " passengers on the bus");
    }

    @Override
    public int refuelling(int liters) {
        int sum = liters * 40;
        return sum;
    }
}
