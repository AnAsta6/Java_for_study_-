package ru.example.lab;

// задание 1.1

public class Task1 {
    private double x; // Координата X точки
    private double y; // Координата Y точки

    // Конструктор класса Task1
    public Task1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Переопределение метода toString для вывода текстового представления точки
    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }

    // Геттеры для доступа к координатам
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Сеттеры для изменения координат
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

}