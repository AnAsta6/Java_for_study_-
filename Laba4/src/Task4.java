// 3.1

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Интерфейс для объекта с методом apply
interface Applicable<T, P> {
    P apply(T value);
}

// Класс
class Task4 {

    // Обобщенный метод для применения функции к каждому элементу списка
    public static <T, P> List<P> applyFunction(List<T> list, Applicable<T, P> applicable) {
        List<P> result = new ArrayList<>();
        for (T item : list) {
            result.add(applicable.apply(item));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пример 1: Список строк -> Список длин строк
        List<String> stringList = new ArrayList<>();
//        stringList.add("qwerty");
//        stringList.add("asdfg");
//        stringList.add("zx");

        System.out.println("Введите три строки:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            stringList.add(scanner.nextLine());
        }

        List<Integer> stringLengths = applyFunction(stringList, String::length);
        System.out.println("Длины строк: " + stringLengths);

        // Пример 2: Список целых чисел -> Список положительных чисел
        List<Integer> intList = new ArrayList<>();
//        intList.add(1);
//        intList.add(-3);
//        intList.add(7);

        System.out.println("Введите три целых числа:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            intList.add(scanner.nextInt());
        }
        scanner.nextLine(); // Очистка буфера

        List<Integer> positiveInts = applyFunction(intList, value -> value < 0 ? -value : value);
        System.out.println("Положительные целые числа: " + positiveInts);

        // Пример 3: Список массивов целых чисел -> Список максимальных значений
        List<int[]> intArrayList = new ArrayList<>();
//        intArrayList.add(new int[]{1, 2, 3});
//        intArrayList.add(new int[]{4, 5, 6});
//        intArrayList.add(new int[]{7, 8, 9});

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

        List<Integer> maxValues = applyFunction(intArrayList, array -> {
            int max = array[0];
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        });
        System.out.println("Максимальные значения: " + maxValues);
    }
}
