package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.streamapi.MatrixConverter;
import java.util.List;
import static org.hamcrest.core.Is.is;

public class MatrixConvertTest {
    @Test
    public void checkConvert() {
        Integer[][] arr = {
                {1, 2, 3},
                {4, 5, 6}};
        MatrixConverter mc = new MatrixConverter();
        List<Integer> list = mc.convert(arr);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        Assert.assertThat(list, is(expected));
    }
}
