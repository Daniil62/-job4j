package ru.job4j.oop;

import java.util.Random;

public class Cat {
    private String name;
    private String colour;
    private String food;
    private Random rand = new Random();
    private String[] nameBox = new String[]{"Boris", "Pushok", "Vovan", "Iogann", "Jean-Paul"};
    private String[] colourBox = new String[]{"black", "white", "tiger", "grey", "black & white", "ginger"};
    private String[] foodBox = new String[]{"fish", "meet", "cutlet", "tushonka", "potato"};

    public Cat(String name, String colour, String food) {
        this.name = name;
        this.colour = colour;
        this.food = food;
    }
    public void randomCat() {
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
    public void giveName(String name) {
        this.name = name;
    }
    public void catInfo() {
        System.out.println("\nCat`s name is: " + name + "\n"
                          + name + "`s" + " colour is: " + colour + "\n"
                          + name + "`s" + " food is: " + food + ".");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "ginger", "pizza");
        cat.catInfo();
        Cat secondCat = new Cat("Vasily", "grey", "sausage");
        secondCat.catInfo();
        Cat firstCat = new Cat("", "white", "");
        firstCat.giveName("Rodriguez");
        firstCat.randomCat();
        firstCat.catInfo();
        firstCat.randomCat();
        firstCat.catInfo();
        Cat newCat = new Cat("", "", "");
        newCat.giveName("Philip");
        newCat.randomCat();
        newCat.catInfo();
    }
}
