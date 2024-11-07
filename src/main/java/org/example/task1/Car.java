package org.example.task1;

public class Car implements Drivable {
    private String make;
    private String model;
    private int year;
    private boolean isRunning;

    // Конструктор
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = false;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void start() {
        isRunning = true;
        System.out.println("Автомобиль " + make + " " + model + " запущен.");
    }

    @Override
    public void stop() {
        isRunning = false;
        System.out.println("Автомобиль " + make + " " + model + " остановлен.");
    }

    @Override
    public void drive(double distance) {
        System.out.println("Автомобиль " + make + " " + model + " едет на расстояние " + distance + " км.");
    }

    @Override
    public String toString() {
        return "Автомобиль: " + make + " " + model + ", Год выпуска: " + year;
    }
}
