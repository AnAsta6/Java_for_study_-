package ru.example.lab.geometry;

public class Circle implements Shape {
    private Point2D center;
    private double radius;

    public Circle(Point2D center, double radius) {
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