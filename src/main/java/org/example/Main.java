package org.example;

import org.example.task1.*;

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

        System.out.println();

        // Задача "Студент"
        Student student1 = new Student("Ада Лавлейс", "010123", 5.0);
        Student student2 = new Student("Cэм Альтман","002534535355", 5.0 );
        student1.print();
        student2.print();

        System.out.println();

        // Задача 'Точка на плоскости'
        Point point = new Point(5, 0);

        System.out.println(point);
        point.moveUp();
        point.moveRight();
        point.moveDown();
        point.moveLeft();
        System.out.println(point);

        System.out.println();

        // Задача 'Часы'
        Clock clock = new Clock(14, 30, 45);

        clock.readTime();
        clock.tick();
        clock.readTime();

        System.out.println();

        // Задача 'Автомобиль'
        Car car = new Car("Toyota", "Corolla", 2020);

        System.out.println(car);
        car.start();
        car.drive(100);
        car.stop();
        car.drive(50);
    }
}