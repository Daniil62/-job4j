package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class FitnessTest {
    @Test
    public void gainProgress() {
        Fitness athletic = new Fitness();
        int out = athletic.training(60, 50);
        Assert.assertThat(out, is(3));
    }
    @Test
    public void gainProgress2() {
        Fitness athletic = new Fitness();
        int out = athletic.training(80, 90);
        Assert.assertThat(out, is(0));
    }
    @Test
    public void gainProgress3() {
        Fitness athletic = new Fitness();
        int out = athletic.training(100, 50);
        Assert.assertThat(out, is(8));
    }
}
