package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class TurnTest {
    @Test
    public void reverseTest() {
        Turn turn = new Turn();
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] out = turn.reverse(array);
        int[] expect = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Assert.assertThat(out, is(expect));
    }
    @Test
    public void reverseTest2() {
        Turn turn = new Turn();
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] out = turn.reverse(array);
        int[] expect = new int[] {8, 7, 6, 5, 4, 3, 2, 1};
        Assert.assertThat(out, is(expect));
    }
    @Test
    public void reverseTest3() {
        Turn turn = new Turn();
        int[] array = new int[] {1, 2};
        int[] out = turn.reverse(array);
        int[] expect = new int[] {2, 1};
        Assert.assertThat(out, is(expect));
    }
    @Test
    public void reverseTest4() {
        Turn turn = new Turn();
        int[] array = new int[] {1};
        int[] out = turn.reverse(array);
        int[] expect = new int[] {1};
        Assert.assertThat(out, is(expect));
    }
}
