package ru.job4j.oop;

import java.util.Random;

public class Cat {
    private
    String name;
    String colour;
    String food;
    Random rand = new Random();
    String[] nameBox = new String[]{"Boris", "Pushok", "Vovan", "Iogann", "Jean-Paul"};
    String[] colourBox = new String[]{"black", "white", "tiger", "grey", "black & white", "ginger"};
    String[] foodBox = new String[]{"fish", "meet", "cutlet", "tushonka", "potato"};
    public
    Cat(String name, String colour, String food) {
        this.name = name;
        this.colour = colour;
        this.food = food;
        if (name.equals("random") || name.equals("")) {
            this.name = nameBox[rand.nextInt(5)];
        }
        if (colour.equals("random") || colour.equals("")) {
            this.colour = colourBox[rand.nextInt(6)];
        }
        if (food.equals("random") || food.equals("")) {
            this.food = foodBox[rand.nextInt(5)];
        }
    }
    void giveName(String name) {
        this.name = name;
    }
    void catInfo() {
        System.out.println("\nCat`s name is: " + name + "\n"
                          + name + "`s" + " colour is: " + colour + "\n"
                          + name + "`s" + " food is: " + food + ".");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("", "", "");
        cat.catInfo();
        Cat secondCat = new Cat("Vasily", "grey", "sausage");
        secondCat.catInfo();
        Cat firstCat = new Cat("", "white", "");
        firstCat.giveName("Rodriguez");
        firstCat.catInfo();
        Cat newCat = new Cat("", "", "");
        newCat.giveName("Philip");
        newCat.catInfo();
    }
}
