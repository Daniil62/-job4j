package ru.job4j.pojo;

public class Shop {
    public Product[] delete(Product[] assortment, int index) {
        System.out.println("! Deleting empty position !" + System.lineSeparator());
        for (int i = index; i < assortment.length - 1; ++i) {
                assortment[index] = assortment[i + 1];
                assortment[i + 1] = null;
        }
        return assortment;
    }
    public void showAssortment(Product[] assortment) {
        for (int i = 0; i < assortment.length; ++i) {
            if (assortment[i] != null) {
                System.out.println("product: " + assortment[i].getName() + System.lineSeparator()
                        + "quantity: " + assortment[i].getCount() + System.lineSeparator());
            } else {
                System.out.println("empty position." + System.lineSeparator());
            }
        }
    }

    public static void main(String[] args) {
        Product[] assortment = new Product[8];
        Shop shop = new Shop();
        assortment[0] = new Product("buckwheat", 90);
        assortment[1] = new Product("potato", 100);
        assortment[2] = null;
        assortment[3] = new Product("cheese", 40);
        assortment[4] = new Product("broad", 70);
        assortment[5] = new Product("coffee", 35);
        assortment[6] = new Product("kefir", 40);
        assortment[7] = new Product("rice", 90);
        shop.showAssortment(assortment);
        shop.delete(assortment, 2);
        shop.showAssortment(assortment);
    }
}

