package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class SqMaxErrorTest {

    @Test
    public  void findError () {
        int out = SqMaxError.max(4, 2, 8, 5);
        Assert.assertThat(out, is(8));
    }
    @Test
    public  void findError2 () {
        int out = SqMaxError.max(1, 2, 3, 5);
        Assert.assertThat(out, is(5));
    }
    @Test
    public  void findError3 () {
            int out = SqMaxError.max(1, 2, 5, 3);
            Assert.assertThat(out, is(5));
    }
    @Test
    public  void findError4 () {
        int out = SqMaxError.max(1, 5, 3, 2);
        Assert.assertThat(out, is(5));
    }
    @Test
    public  void findError5 () {
        int out = SqMaxError.max(5, 2, 3, 1);
        Assert.assertThat(out, is(5));
    }
    @Test
    public  void findError6 () {
        int out = SqMaxError.max(9, 2, 3, 7);
        Assert.assertThat(out, is(9));
    }
    @Test
    public  void findError7 () {
        int out = SqMaxError.max(6, 8, 3, 1);
        Assert.assertThat(out, is(8));
    }
    @Test
    public  void findError8 () {
        int out = SqMaxError.max(8, 2, 3, 9);
        Assert.assertThat(out, is(9));
    }
    @Test
    public  void findError9 () {
        int out = SqMaxError.max(5, 4, 3, 9);
        Assert.assertThat(out, is(9));
    }
}
