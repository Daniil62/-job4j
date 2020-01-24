package ru.job4j.oop;

public class Student {
    private
    String name;
    String song = "\n\tYesterday,\n"
            + "\tall my troubles seemed so far away,\n"
            + "\tNow it looks as though they're here to stay.\n"
            + "\tOh, I believe in yesterday.\n";
    public
    Student(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void sing(String request) {
        String answer = "";
        if (request.equals(name + ", cпой, пожалуйста.")) {
            answer = "-Конечно спою, чувак:" + song;
        } else {
            answer = "Те че надо? Отвали, я позову полицию!";
        }
        System.out.println(request);
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Student student = new Student("Вован");
        System.out.println("Чувак, как тебя зовут? " + "\n" + "-" + student.getName());
        student.sing(student.getName() + ", cпой, пожалуйста.");
        Student student2 = new Student("Игорек");
        System.out.println("Братишка, как звать? " + "\n" + "-" + student2.getName());
        student.sing(student2.getName() + ", мелочь есть?");
    }
}
