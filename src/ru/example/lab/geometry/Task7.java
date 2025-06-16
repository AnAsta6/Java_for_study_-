package ru.example.lab.geometry;

/**
 * Демонстрационный класс для тестирования методов equals() и hashCode() класса Point2D.
 * Создает несколько точек и проверяет их сравнение и хэш-коды.
 */
public class Task7 {
    /**
     * Основной метод программы, выполняющий тестирование функциональности Point2D.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // Создание трех точек для тестирования:
        // pointA и pointB с одинаковыми координатами,
        // pointC с другими координатами
        Point2D pointA = new Point2D(1.0, 2.0);
        Point2D pointB = new Point2D(1.0, 2.0);
        Point2D pointC = new Point2D(3.0, 4.0);

        // Тестирование метода equals:
        // Сравнение одинаковых точек (ожидается true)
        // и разных точек (ожидается false)
        System.out.println("Сравнение точек:");
        System.out.println("pointA.equals(pointB): " + pointA.equals(pointB)); // true
        System.out.println("pointA.equals(pointC): " + pointA.equals(pointC)); // false

        // Тестирование метода hashCode:
        // Вывод хэш-кодов для проверки согласованности с equals
        // Ожидается, что одинаковые точки дают одинаковые хэш-коды
        System.out.println("Хэш-коды точек:");
        System.out.println("pointA.hashCode(): " + pointA.hashCode());
        System.out.println("pointB.hashCode(): " + pointB.hashCode());
        System.out.println("pointC.hashCode(): " + pointC.hashCode());
    }
}