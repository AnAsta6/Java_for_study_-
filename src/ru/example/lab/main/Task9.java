
package  ru.example.lab.main;

import ru.example.lab.geometry.*;
import  ru.example.lab.list.*;

/**
 * Главный класс
 */
public final class Task9 {
    public static void main(String[] args) {
        System.out.println("Лабораторная работа #3");

        // Демонстрация работы
        Task1 student = new Task1("Иванов");
        student.addGrade(5);
        System.out.println(student);

        Point2D point = new Point2D(3, 4);
        System.out.println("Точка: " + point);
    }
}