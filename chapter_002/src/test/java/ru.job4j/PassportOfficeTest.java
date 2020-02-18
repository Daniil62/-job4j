package ru.job4j;

import org.junit.Test;
import ru.job4j.collection.Citizen;
import ru.job4j.collection.PassportOffice;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class PassportOfficeTest {

    @Test
    public void whenAdd() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }
    @Test
    public void whenNotAdd() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen falseCitizen = new Citizen("2f44a", "Vasya Pupkin");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.add(falseCitizen), is(false));
    }
}
