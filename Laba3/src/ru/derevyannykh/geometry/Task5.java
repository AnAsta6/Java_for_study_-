package ru.derevyannykh.geometry;


import java.util.List;

// Класс Task5
public class Task5 {
    // Метод для вычисления общей площади
    public static double totalArea(List<Shape> shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.area();
        }
        return total;
    }
}


// Интерфейс Shape
interface Shape {
    double area();
}

// Класс Point
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

// Класс Circle
class Circle implements Shape {
    private Point1 center;
    private double radius;

    public Circle(Point1 center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Круг с радиусом " + radius + " и площадью " + area();
    }
}

// Класс Square
class Square implements Shape {
    private Point1 topLeft;
    private double side;

    public Square(Point1 topLeft, double side) {
        this.topLeft = topLeft;
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Квадрат со стороной " + side + " и площадью " + area();
    }
}

// Класс Rectangle
class Rectangle implements Shape {
    private Point1 topLeft;
    private double width;
    private double height;

    public Rectangle(Point1 topLeft, double width, double height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height; // Площадь прямоугольника
    }

    @Override
    public String toString() {
        return "Прямоугольник с шириной " + width + ", высотой " + height + " и площадью " + area();
    }
}

// Класс Triangle
public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2; // Полупериметр
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Площадь по формуле Герона
    }

    @Override
    public String toString() {
        return "Треугольник со сторонами " + a + ", " + b + ", " + c + " и площадью " + area();
    }
}