package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.DepDescComp;
import ru.job4j.collection.Departments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.greaterThan;

public class DepartmentsTest {

    @Test
    public void compare() {
        int rsl = new DepDescComp().compare("K2/SK1/SSK2", "K2/SK1/SSK1");
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        Departments dep = new Departments();
        int rsl = new DepDescComp().compare("K2", "K2/SK1");
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void fillGapsTest() {
        List<String> departments = new ArrayList<>(Arrays.asList("K1/SK1/SSK2"));
        List<String> expected = Arrays.asList("K1/SK1", "K1", "K1/SK1/SSK2");
        Assert.assertThat(Departments.fillGaps(departments), is(expected));
    }
    @Test
    public void sortAscTest() {
        List<String> departments = new ArrayList<>(Arrays.asList("K1/SK1",  "K2/SK1", "K2", "K1"));
        Departments.sortAsc(departments);
        List<String> expected = Arrays.asList("K1", "K1/SK1", "K2", "K2/SK1");
        Assert.assertThat(departments, is(expected));
    }
    @Test
    public void sortDescTest() {
        List<String> departments = new ArrayList<>(Arrays.asList("K1/SK1", "K2", "K2/SK1", "K1"));
        Departments.sortDesc(departments);
        List<String> expected = Arrays.asList("K2", "K2/SK1", "K1", "K1/SK1");
        Assert.assertThat(departments, is(expected));
    }
}
