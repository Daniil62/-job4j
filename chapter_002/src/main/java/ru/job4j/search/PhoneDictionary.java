package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); ++i) {
            if (persons.get(i).getName().contains(key) || persons.get(i).getSurname().contains(key)
                    || persons.get(i).getPhone().contains(key)
                    || persons.get(i).getAddress().contains(key)) {
                result.add(persons.get(i));
                System.out.println(persons.get(i).getName()
                        + " " + persons.get(i).getSurname() + ","
                        + " " +  persons.get(i).getPhone() + ","
                        + " " +  persons.get(i).getAddress()
                        + System.lineSeparator());
            }
            else {
                result = null;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        PhoneDictionary pd = new PhoneDictionary();
        Person person1 = new Person
                ("Evgeny", "Lukashin", "454-60-21", "Moscow, Third builders st., 25, 12");
        Person person2 = new Person
                ("Nadezhda", "Sheveleva", "14-50-30", "Leningrad, Third builders st., 25, 12");
        pd.add(person1);
        pd.add(person2);
        pd.find("Third");
    }
}
