//2.1.5

// задание 3.5

//для 2.3

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ts215 {
    private double x; // Координата X точки
    private double y; // Координата Y точки
    private double z; // Координата Z точки

    // Конструктор класса
    public Ts215(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Переопределение метода toString для вывода текстового представления точки
    @Override
    public String toString() {
        return "{" + x + ";" + y + ";" + z + "}";
    }

    // Геттеры для доступа к координатам
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    // Сеттеры для изменения координат
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0, y = 0, z = 0;

        // Ввод координаты X
        while (true) {
            try {
                System.out.print("Введите координату X: ");
                x = scanner.nextDouble();
                break; // Выход из цикла, если ввод корректен
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                scanner.next(); // Очистка некорректного ввода
            }
        }

        // Ввод координаты Y
        while (true) {
            try {
                System.out.print("Введите координату Y: ");
                y = scanner.nextDouble();
                break; // Выход из цикла, если ввод корректен
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                scanner.next(); // Очистка некорректного ввода
            }
        }

        // Ввод координаты Z
        while (true) {
            try {
                System.out.print("Введите координату Z: ");
                z = scanner.nextDouble();
                break; // Выход из цикла, если ввод корректен
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Пожалуйста, введите число, если Вы вводите дробное число, то используйте запятую.");
                scanner.next(); // Очистка некорректного ввода
            }
        }

        // Создание объекта Ts215 с введенными координатами
        Ts215 point = new Ts215(x, y, z);

        // Вывод информации о точке
        System.out.println("Введенная трехмерная точка: " + point.toString());
    }
}
