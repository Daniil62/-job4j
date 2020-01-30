package ru.job4j.pojo;

public class Shop {
    public Product[] delete(Product[] assortment) {
        System.out.println("! Deleting empty positions !" + System.lineSeparator());
        for (int i = 0; i < assortment.length; ++i) {
            if (assortment[i] == null && i < assortment.length - 1) {
                assortment[i] = assortment[i + 1];
                assortment[i + 1] = null;
            }
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
        Product[] assortment2 = new Product[8];
        Shop shop = new Shop();
        assortment[0] = new Product("buckwheat", 90);
        assortment[1] = null;
        assortment[2] = new Product("potato", 100);
        assortment[3] = new Product("cheese", 40);
        assortment[4] = new Product("broad", 70);
        assortment[5] = null;
        assortment[6] = new Product("kefir", 40);
        assortment[7] = new Product("rice", 90);

        assortment2[0] = new Product("buckwheat", 90);
        assortment2[1] = new Product("potato", 100);
        assortment2[2] = new Product("cheese", 40);
        assortment2[3] = new Product("broad", 70);
        assortment2[4] = null;
        assortment2[5] = new Product("coffee", 35);
        assortment2[6] = new Product("kefir", 40);
        assortment2[7] = new Product("rice", 90);
        shop.showAssortment(assortment);
        shop.delete(assortment);
        shop.showAssortment(assortment);
        shop.delete(assortment);
        shop.showAssortment(assortment);

        System.out.println("=============================================================" + System.lineSeparator());

        shop.showAssortment(assortment2);
        shop.delete(assortment2);
        shop.showAssortment(assortment2);
    }
}

