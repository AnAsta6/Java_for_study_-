
package ru.example.lab.geometry;

import ru.example.lab.geometry.Point2D;

/**
 * Демонстратор клонирования
 */
public final class Task11 {
    public static void demonstrate() {
        Point2D original = new Point2D(1, 2);
        Point2D clone = original.clone();

        System.out.println("Оригинал: " + original);
        System.out.println("Клон: " + clone);
        System.out.println("Это один объект? " + (original == clone));
    }
}