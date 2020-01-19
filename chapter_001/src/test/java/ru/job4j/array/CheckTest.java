package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class CheckTest {
    @Test
    public void trueOrFalse() {
        Check check = new Check();
        boolean[] array = new boolean[]{false, false, false, true};
        boolean out = check.mono(array);
        Assert.assertThat(out, is(false));
    }
    @Test
    public void trueOrFalse2() {
        Check check = new Check();
        boolean[] array = new boolean[]{false, false, false, false};
        boolean out = check.mono(array);
        Assert.assertThat(out, is(true));
    }
    @Test
    public void trueOrFalse3() {
        Check check = new Check();
        boolean[] array = new boolean[]{true, true, false, true, true};
        boolean out = check.mono(array);
        Assert.assertThat(out, is(false));
    }
}
