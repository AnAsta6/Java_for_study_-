package ru.example.lab;

import java.util.Scanner;

/**
 * Программа для создания и вывода точек на двумерной плоскости.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты для первой точки:");
        System.out.print("Введите координату X: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите координату Y: ");
        double y1 = scanner.nextDouble();
        Task1 point1 = new Task1(x1, y1);
        System.out.println(point1);

        System.out.println("Введите координаты для второй точки:");
        System.out.print("Введите координату X: ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите координату Y: ");
        double y2 = scanner.nextDouble();
        Task1 point2 = new Task1(x2, y2);
        System.out.println(point2);

        System.out.println("Введите координаты для третьей точки:");
        System.out.print("Введите координату X: ");
        double x3 = scanner.nextDouble();
        System.out.print("Введите координату Y: ");
        double y3 = scanner.nextDouble();
        Task1 point3 = new Task1(x3, y3);
        System.out.println(point3);

        scanner.close();
    }
}
