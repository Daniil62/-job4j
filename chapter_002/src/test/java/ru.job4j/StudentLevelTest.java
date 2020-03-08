package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.streamapi.student.Student;
import ru.job4j.streamapi.student.StudentLevel;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class StudentLevelTest {
    @Test
    public void checkLevelSort() {
        List<Student> students = Arrays.asList(new Student("Ivanov", 79),
                null,
                new Student("Sidorov", 86),
                null,
                new Student("Petrov", 86));
        StudentLevel level = new StudentLevel();
        List<Student> relevant = level.levelOf(students, 80);
        Assert.assertThat(relevant.size(), is(2));
        Assert.assertThat(relevant.get(0).getName(), is("Petrov"));
    }
}
