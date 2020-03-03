package ru.job4j.streamapi;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> group = students.stream().filter(predict)
                .collect(Collectors.toList());
        group.forEach(System.out::println);
        return group;
    }
    public Map<String,Student> collectToMap(List<Student> students) {
        return students.stream().collect(Collectors.toMap(Student::getSurname, s -> s));
    }
}
