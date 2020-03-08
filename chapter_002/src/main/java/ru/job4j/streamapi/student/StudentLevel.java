package ru.job4j.streamapi.student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevel {
    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream().flatMap(Stream::ofNullable).sorted()
                .takeWhile(s -> s.getScore() > bound).collect(Collectors.toList());
    }
}
