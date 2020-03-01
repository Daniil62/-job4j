package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.streamAPI.School;
import ru.job4j.streamAPI.Student;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;

public class SchoolTest {
    @Test
    public void stupidSort() {
        School school = new School();
        List<Student> students = Arrays.asList(new Student(62),
                new Student(47), new Student(99));
        List<Student> stupidStudents = school.collect(students, stud -> stud.getScore() > 0
                && stud.getScore() <= 50);
        Assert.assertThat(stupidStudents.size(), is(1));
        Assert.assertThat(stupidStudents.get(0), is(new Student(47)));
    }
    @Test
    public void mediumSort() {
        School school = new School();
        List<Student> students = Arrays.asList(new Student(62),
                new Student(47), new Student(99));
        List<Student> mediumStudents = school.collect(students, stud -> stud.getScore() > 50
                && stud.getScore() <= 70);
        Assert.assertThat(mediumStudents.size(), is(1));
        Assert.assertThat(mediumStudents.get(0), is(new Student(62)));
    }
    @Test
    public void cleverSort() {
        School school = new School();
        List<Student> students = Arrays.asList(new Student(62),
                new Student(47), new Student(99));
        List<Student> cleverStudents = school.collect(students, stud -> stud.getScore() > 70
                && stud.getScore() <= 100);
        Assert.assertThat(cleverStudents.size(), is(1));
        Assert.assertThat(cleverStudents.get(0), is(new Student(99)));
    }
}
