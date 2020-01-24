package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class DefragmentTest {
    @Test
    public void defragmenTest() {
        String[] array = {null, null, null, "Hello", null, " ", null, "world"};
        String[] out = Defragment.compress(array);
        String[] expected = {"Hello", " ", "world", null, null, null, null, null};
        Assert.assertThat(out, is(expected));
    }
}
