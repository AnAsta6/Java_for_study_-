package ru.derevyannykh.geometry;

// задание 3.5

public class Task3 {
    private double x; // Координата X точки
    private double y; // Координата Y точки
    private double z; // Координата Z точки

    // Конструктор класса 
    public Task3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Переопределение метода toString для вывода текстового представления точки
    @Override
    public String toString() {
        return "{" + x + ";" + y + ";" + z + "}";
    }

    // Геттеры для доступа к координатам
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    // Сеттеры для изменения координат
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

}