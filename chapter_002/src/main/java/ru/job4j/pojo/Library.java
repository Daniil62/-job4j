package ru.job4j.pojo;

public class Library {
    public void showLibrary(Book[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.println("Book: " + array[i].getName() + ","
                    + System.lineSeparator() + "author " + array[i].getAuthor() + ","
                    + System.lineSeparator() + array[i].getPagesCount() + " pages."
                    + System.lineSeparator());
        }
    }
    public void replace(Book[] array, int a, int b) {
        if (a < array.length && b < array.length) {
            System.out.println("! Replace books: " + array[a].getName() + " & " + array[b].getName() + " !");
            Book temp = new Book();
            temp = array[a];
            array[a] = array[b];
            array[b] = temp;
            temp = null;
        } else {
            System.out.println("Такой книги нет в библиотеке.");
        }
    }
    public void search(String name, Book[] array) {
        System.out.println("Search the: " + "\"" + name + "\"" + " book");
        for (int i = 0; i < array.length; ++i) {
            if (array[i].getName().equals(name)) {
                System.out.println("Book: " + array[i].getName() + ","
                        + System.lineSeparator() + "author " + array[i].getAuthor() + ","
                        + System.lineSeparator() + array[i].getPagesCount() + " pages."
                        + System.lineSeparator());
            }
        }
    }
    public static void main(String[] args) {
        Library librarian = new Library();
        Book bookOne = new Book();
        Book bookTwo = new Book();
        Book bookThree = new Book();
        Book bookFour = new Book();
        Book[] array = new Book[4];
        bookOne.setName("Nausea");
        bookOne.setAuthor("Jean-Paul Sartre");
        bookOne.setPagesCount(290);
        bookTwo.setName("Idiot");
        bookTwo.setAuthor("Fedor Michailovitch Dostoevsky");
        bookTwo.setPagesCount(641);
        bookThree.setName("Clean code");
        bookFour.setName("Java complete guide tenth edition");
        bookFour.setAuthor("Herbert Schildt");
        bookFour.setPagesCount(1489);
        array[0] = bookOne;
        array[1] = bookTwo;
        array[2] = bookThree;
        array[3] = bookFour;
        librarian.showLibrary(array);
        librarian.replace(array, 0, 3);
        librarian.showLibrary(array);
        librarian.search("Clean code", array);
    }
}
