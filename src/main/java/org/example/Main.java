package org.example;

import org.example.task1.BankAccount;
import org.example.task1.Book;
import org.example.task1.Student;

public class Main {
    public static void main(String[] args) {
        // Задача "Банковский счет"
        BankAccount account1 = new BankAccount();
        account1.setBalance(8000);
        account1.print();

        System.out.println(); // Для разделения выводов

        // Задача "Книга"
        Book book1 = new Book("Убийство в Восточном экспрессе", "Агата Кристи", 1934);
        book1.display();

        System.out.println(); // Для разделения выводов

        // Задача "Студент"
        Student student1 = new Student("Ада Лавлейс", "010123", 5.0);
        Student student2 = new Student("Cэм Альтман","002534535355", 5.0 );
        student1.print();
        student2.print();
    }
}