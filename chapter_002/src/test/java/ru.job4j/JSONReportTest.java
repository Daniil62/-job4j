package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.JSONReport;
import static org.hamcrest.core.Is.is;

public class JSONReportTest {
    @Test
    public void JSONReportCorrectTest() {
        JSONReport jsonText = new JSONReport();
        String out = jsonText.generate("*name*", "bla bla bla body bla bla bla");
        String expected = "{" + System.lineSeparator()
                + "name : *name*" + System.lineSeparator()
                + "body : bla bla bla body bla bla bla" + System.lineSeparator()
                + "}";
        Assert.assertThat(out, is(expected));
    }
}
