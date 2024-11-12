package ru.derevyannykh.geometry;


// Task4.java
public class Task4 {
    private String shapeType; // Тип фигуры
    private double area; // Площадь фигуры

    // Конструктор для создания фигуры
    public Task4(String shapeType, double area) {
        this.shapeType = shapeType;
        this.area = area;
    }

    // Переопределение метода toString для вывода текстового представления фигуры
    @Override
    public String toString() {
        return "Фигура: " + shapeType + ", Площадь: " + area;
    }

    // Геттеры
    public String getShapeType() {
        return shapeType;
    }

    public double getArea() {
        return area;
    }
}