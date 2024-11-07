package org.example;

import org.example.task1.BankAccount;

/**
 * Задача "Банковский счет":
 * Создайте класс BankAccount c полями для хранения номера счета и баланса.
 * Реализуйте методы для получения (get), установки (set) баланса, а так же для внесения и снятия денег.
 * Создайте интерфейс Printable с методом print(), который будет реализован в классе BankAccount для вывода информации
 */

// комментарий к коду
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setBalance(8000);
        account1.print();
    }
}