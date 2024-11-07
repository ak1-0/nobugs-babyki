package org.example.task1;

// шаблон для создания объекта
public class BankAccount implements Printable {
    private String accountNumber;
    private int balance;

    //сеттеры
    public void setBalance(int balance) {
        this.balance = balance;
    }

    //геттеры
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void print() {
        System.out.println("Баланс аккаунта " + this.balance);
    }
}
