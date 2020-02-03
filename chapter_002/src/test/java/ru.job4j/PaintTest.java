package ru.job4j;

import org.junit.Test;
import ru.job4j.strategy.Paint;
import ru.job4j.strategy.Square;
import ru.job4j.strategy.Triangle;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class PaintTest {
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        StringBuilder pic = new StringBuilder();
        assertThat(new String(out.toByteArray()),
                is(pic.append("++++++" + System.lineSeparator())
                                + ("+    +" + System.lineSeparator())
                                + ("+    +" + System.lineSeparator())
                                + ("++++++" + System.lineSeparator())
                                + System.lineSeparator()));
        System.setOut(stdout);
    }
    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        StringBuilder pic = new StringBuilder();
        assertThat(new String(out.toByteArray()),
                is(pic.append("   +   " + System.lineSeparator())
                        + ("  + +  " + System.lineSeparator())
                        + (" +   + " + System.lineSeparator())
                        + ("+++++++" + System.lineSeparator())
                        + System.lineSeparator()));
        System.setOut(stdout);
    }
}
