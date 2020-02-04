package ru.job4j;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.strategy.Paint;
import ru.job4j.strategy.Square;
import ru.job4j.strategy.Triangle;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class PaintTest {
        private final PrintStream stdout = System.out;
        private final ByteArrayOutputStream out = new ByteArrayOutputStream();
        @Before
        public void loadOutput() {
            System.out.println("execute before method");
            System.setOut(new PrintStream(this.out));
        }
        @After
        public void backOutput() {
            System.setOut(this.stdout);
            System.out.println("execute after method");
        }
    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        StringBuilder pic = new StringBuilder();
        assertThat(new String(out.toByteArray()),
                is(pic.append("++++++" + System.lineSeparator())
                                + ("+    +" + System.lineSeparator())
                                + ("+    +" + System.lineSeparator())
                                + ("++++++" + System.lineSeparator())
                                + System.lineSeparator()));
    }
    @Test
    public void whenDrawTriangle() {
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        StringBuilder pic = new StringBuilder();
        assertThat(new String(out.toByteArray()),
                is(pic.append("   +   " + System.lineSeparator())
                        + ("  + +  " + System.lineSeparator())
                        + (" +   + " + System.lineSeparator())
                        + ("+++++++" + System.lineSeparator())
                        + System.lineSeparator()));
    }
}
