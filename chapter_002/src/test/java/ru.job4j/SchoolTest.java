package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.streamapi.School;
import ru.job4j.streamapi.Student;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;

public class SchoolTest {
    @Test
    public void stupidSort() {
        School school = new School();
        List<Student> students = Arrays.asList(new Student(62, "Ivanov"),
                new Student(47, "Petrov"), new Student(99, "Sidorov"));
        List<Student> stupidStudents = school.collect(students, stud -> stud.getScore() > 0
                && stud.getScore() <= 50);
        Assert.assertThat(stupidStudents.size(), is(1));
        Assert.assertThat(stupidStudents.get(0), is(new Student(47, "Petrov")));
    }
    @Test
    public void mediumSort() {
        School school = new School();
        List<Student> students = Arrays.asList(new Student(62, "Ivanov"),
                new Student(47, "Petrov"), new Student(99, "Sidorov"));
        List<Student> mediumStudents = school.collect(students, stud -> stud.getScore() > 50
                && stud.getScore() <= 70);
        Assert.assertThat(mediumStudents.size(), is(1));
        Assert.assertThat(mediumStudents.get(0), is(new Student(62, "Ivanov")));
    }
    @Test
    public void cleverSort() {
        School school = new School();
        List<Student> students = Arrays.asList(new Student(62, "Ivanov"),
                new Student(47, "Petrov"), new Student(99, "Sidorov"));
        List<Student> cleverStudents = school.collect(students, stud -> stud.getScore() > 70
                && stud.getScore() <= 100);
        Assert.assertThat(cleverStudents.size(), is(1));
        Assert.assertThat(cleverStudents.get(0), is(new Student(99, "Sidorov")));
    }
    @Test
    public void collectToMapTest() {
        School school = new School();
        List<Student> students = Arrays.asList(new Student(62, "Ivanov"),
                new Student(47, "Petrov"), new Student(99, "Sidorov"));
        Map<String, Student> map = school.collectToMap(students);
        Assert.assertThat(map.get("Ivanov").getScore(), is(62));
        Assert.assertThat(map.get("Sidorov").getScore(), is(99));
    }
}
