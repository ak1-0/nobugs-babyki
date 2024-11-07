package org.example.task1;

public class Book implements Displayable {
    private String title;
    private String author;
    private int year;

    // Конструктор
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Название книги: " + title + "\nАвтор: " + author + "\nГод издания: " + year;
    }
}
