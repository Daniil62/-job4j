package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class SqMaxErrorTest {
    @Test
    public  void findError () {
        int out = SqMaxError.max(1, 2, 3, 5);
        Assert.assertThat(out, is(5));

        int out2 = SqMaxError.max(1, 2, 5, 3);
        Assert.assertThat(out2, is(5));

        int out3 = SqMaxError.max(1, 5, 3, 2);
        Assert.assertThat(out3, is(5));

        int out4 = SqMaxError.max(5, 2, 3, 1);
        Assert.assertThat(out4, is(5));
    }
}
