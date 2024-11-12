package ru.derevyannykh.geometry;


public class Point1 {
    private double x;
    private double y;


    // Конструктор
    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Метод для расчета расстояния до другой точки
    public double distanceTo(Point1 other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Переопределение метода equals для сравнения точек
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Сравнение с самим собой
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и тип

        Point1 point = (Point1) obj; // Приведение типа
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0; // Сравнение координат
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        int result = Double.hashCode(x);
        result = 31 * result + Double.hashCode(y);
        return result;
    }
}