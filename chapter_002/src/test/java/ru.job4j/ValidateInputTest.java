package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.StubInput;
import ru.job4j.tracker.ValidateInput;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {
    @Test
    public void whenInvalidInput() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        ValidateInput input = new ValidateInput(new StubInput(new String[] {"one", "1"}));
        input.askInt("Enter");
        Assert.assertThat(mem.toString(), is(String.format("Please enter validate data again.%n")));
        System.setOut(out);
    }
}
