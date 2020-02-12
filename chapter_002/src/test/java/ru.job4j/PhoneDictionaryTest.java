package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.search.Person;
import ru.job4j.search.PhoneDictionary;
import java.util.ArrayList;
import static org.hamcrest.core.Is.is;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Petr");
        Assert.assertThat(persons.get(0).getPhone(), is("534872"));
    }
    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Ars");
        Assert.assertThat(persons.get(0).getPhone(), is("534872"));
    }
    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("872");
        Assert.assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
    @Test
    public void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Bryansk");
        Assert.assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}
