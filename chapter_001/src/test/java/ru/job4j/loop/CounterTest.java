package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class CounterTest {
    @Test
    public void addTest() {
        Counter count = new Counter();
        int out = count.add(0, 16);
        Assert.assertThat(out, is(72));
    }
    @Test
    public void addTest2() {
        Counter count = new Counter();
        int out = count.add(0, 21);
        Assert.assertThat(out, is(110));
    }
    @Test
    public void addTest3() {
        Counter count = new Counter();
        int out = count.add(3, 14);
        Assert.assertThat(out, is(54));
    }
    @Test
    public void addTest4() {
        Counter count = new Counter();
        int out = count.add(7, 8);
        Assert.assertThat(out, is(8));
    }
    @Test
    public void addTest5() {
        Counter count = new Counter();
        int out = count.add(0, 1);
        Assert.assertThat(out, is(0));
    }
}
