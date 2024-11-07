package org.example;

import org.example.task1.BankAccount;
import org.example.task1.Book;

public class Main {
    public static void main(String[] args) {
        // Задача "Банковский счет"
        BankAccount account1 = new BankAccount();
        account1.setBalance(8000);
        account1.print();

        System.out.println(); // Пустая строка для разделения выводов

        // Задача "Книга"
        Book book1 = new Book("Война и мир", "Лев Толстой", 1869);
        book1.display();
    }
}