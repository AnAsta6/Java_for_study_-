// 2.3
import java.util.InputMismatchException;
import java.util.Scanner;

// Класс
class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание коробки для хранения целочисленного значения
        Box<Integer> intBox = new Box<>();
        intBox.put(3);

        // Передача коробки в метод и извлечение значения
        Integer value = intBox.get();
        System.out.println("Извлеченное значение из коробки: " + value);

        // Создание коробки для хранения трехмерной точки координат
        Box<Ts215> pointBox = new Box<>();

        // Ввод координат точки
        double x = 0, y = 0, z = 0;
        while (true) {
            try {
                System.out.print("Введите координату X: ");
                x = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                scanner.next(); // Очистка некорректного ввода
            }
        }

        while (true) {
            try {
                System.out.print("Введите координату Y: ");
                y = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                scanner.next(); // Очистка некорректного ввода
            }
        }

        while (true) {
            try {
                System.out.print("Введите координату Z: ");
                z = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                scanner.next(); // Очистка некорректного ввода
            }
        }

        // Создание объекта Ts215 с введенными координатами
        Ts215 point = new Ts215(x, y, z);

        // Размещение точки в коробке
        pointBox.put(point);

        // Извлечение точки из коробки и вывод информации о точке
        Ts215 extractedPoint = pointBox.get();
        System.out.println("Извлеченная трехмерная точка: " + extractedPoint.toString());
    }
}
