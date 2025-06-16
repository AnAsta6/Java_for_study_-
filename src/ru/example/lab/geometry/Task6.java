package ru.example.lab.geometry ;

import java.util.ArrayList;
import java.util.List;

public class Task6 {
    private List<Point2D> points; // Список точек замкнутой ломаной

    public Task6() {
        this.points = new ArrayList<>();
    }

    // Метод для добавления точки
    public void addPoint(double x6, double y6) {
        points.add(new Point2D(x6, y6));
    }

    // Метод для получения длины замкнутой ломаной
    public double getLength() {
        double length = 0.0;
        for (int i = 0; i < points.size(); i++) {
            Point2D p1 = points.get(i);
            Point2D p2 = points.get((i + 1) % points.size()); // Замыкаем на первую точку
            length += p1.distanceTo(p2);
        }
        return length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Замкнутая ломаная: ");
        for (Point2D point : points) {
            sb.append(point.toString()).append(" ");
        }
        return sb.toString();
    }
}