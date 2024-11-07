package org.example.task1;

public class Book implements Displayable {
    private String title;
    private String author;
    private int year;

    // Конструктор для установки всех полей
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public void display() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + year);
    }
}
