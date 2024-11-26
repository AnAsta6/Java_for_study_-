// 1.3
import java.util.Scanner;

// Интерфейс Comparable
interface Comparable<T> {
    int compare(T other);
}

// Класс, реализующий интерфейс Comparable
class Task1<T extends java.lang.Comparable<T>> implements Comparable<T> {
    private T value;

    // Конструктор
    public Task1(T value) {
        this.value = value;
    }

    // Реализация метода compare
    @Override
    public int compare(T other) {
        return value.compareTo(other);
    }

    // Метод toString
    @Override
    public String toString() {
        return "Task1{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных с клавиатуры
        System.out.print("Введите первое значение: ");
        int firstValue = scanner.nextInt();

        System.out.print("Введите второе значение: ");
        int secondValue = scanner.nextInt();

        // Создание объектов Task1
        Task1<Integer> task1 = new Task1<>(firstValue);
        Task1<Integer> task2 = new Task1<>(secondValue);

        // Сравнение значений
        int comparisonResult = task1.compare(secondValue);

        // Вывод результатов
        System.out.println("Объект 1: " + task1);
        System.out.println("Объект 2: " + task2);
        System.out.println("Результат сравнения: " + comparisonResult);
    }
}
