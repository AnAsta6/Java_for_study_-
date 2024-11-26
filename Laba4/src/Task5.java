// 3.2
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

// Интерфейс для объекта с методом test
interface Testable<T> {
    boolean test(T value);
}

// Класс
class Task5 {

    // Обобщенный метод для фильтрации списка значений
    public static <T> List<T> filterList(List<T> list, Testable<T> testable) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (testable.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пример 1: Список строк -> Отфильтровать строки с менее чем тремя символами
        List<String> stringList = new ArrayList<>();
        System.out.println("Введите три строки:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            stringList.add(scanner.nextLine());
        }

        List<String> filteredStrings = filterList(stringList, value -> value.length() >= 3);
        System.out.println("Отфильтрованные строки: " + filteredStrings);

        // Пример 2: Список целых чисел -> Отфильтровать положительные элементы
        List<Integer> intList = new ArrayList<>();
        System.out.println("Введите три целых числа:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            intList.add(scanner.nextInt());
        }
        scanner.nextLine(); // Очистка буфера

        List<Integer> filteredInts = filterList(intList, value -> value < 0);
        System.out.println("Отфильтрованные целые числа: " + filteredInts);

        // Пример 3: Список массивов целых чисел -> Отфильтровать массивы без положительных элементов
        List<int[]> intArrayList = new ArrayList<>();
        System.out.println("Введите три массива целых чисел (разделенные пробелами):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Массив " + (i + 1) + ": ");
            String[] input = scanner.nextLine().split(" ");
            int[] array = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                array[j] = Integer.parseInt(input[j]);
            }
            intArrayList.add(array);
        }

        List<int[]> filteredArrays = filterList(intArrayList, array -> {
            for (int num : array) {
                if (num > 0) {
                    return false;
                }
            }
            return true;
        });

        // Вывод отфильтрованных массивов в читаемом формате
        if (filteredArrays.isEmpty()) {
            System.out.println("Отфильтрованные массивы: Нет массивов, удовлетворяющих условию");
        } else {
            System.out.print("Отфильтрованные массивы: ");
            for (int[] array : filteredArrays) {
                System.out.print(Arrays.toString(array) + " ");
            }
            System.out.println();
        }
    }
}
