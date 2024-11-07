package org.example.task1;

public class Student implements Printable {
    private String name;
    private String studentId;
    private double averageGrade;

    // Конструктор
    public Student(String name, String studentId, double averageGrade) {
        this.name = name;
        this.studentId = studentId;
        this.averageGrade = averageGrade;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Имя студента: " + name + "\nНомер зачетной книжки: " + studentId + "\nСредний балл: " + averageGrade;
    }
}
