package ru.derevyannykh.geometry;

public class Task7 {
    public static void main(String[] args) {
        // Создание точек
        Point1 pointA = new Point1(1.0, 2.0);
        Point1 pointB = new Point1(1.0, 2.0);
        Point1 pointC = new Point1(3.0, 4.0);

        // Тестирование метода equals
        System.out.println("Сравнение точек:");
        System.out.println("pointA.equals(pointB): " + pointA.equals(pointB)); // true
        System.out.println("pointA.equals(pointC): " + pointA.equals(pointC)); // false

        // Тестирование метода hashCode
        System.out.println("Хэш-коды точек:");
        System.out.println("pointA.hashCode(): " + pointA.hashCode());
        System.out.println("pointB.hashCode(): " + pointB.hashCode());
        System.out.println("pointC.hashCode(): " + pointC.hashCode());
    }
}
