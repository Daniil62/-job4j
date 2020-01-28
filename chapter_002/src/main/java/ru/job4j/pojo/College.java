package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setGroup(4);
        student.setFaculty("рыбного хозяйства");
        student.setName("Карп");
        student.setSecondName("Дельфинович");
        student.setSurname("Акула");
        student.setAdmissionDate("31.02.2020");
        System.out.println("Фамилия: " + student.getSurname() + ".");
        System.out.println("Имя: " + student.getName() + ".");
        System.out.println("Отчество: " + student.getSecondName() + ".");
        System.out.println("Факультет: " + student.getFaculty() + ".");
        System.out.println("Группа №: " + student.getGroup() + ".");
        System.out.println("Дата поступления: " + student.getAdmissionDate() + ".");
    }
}
