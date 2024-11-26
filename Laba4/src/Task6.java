// 3.3
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Интерфейс для объекта с методом reduce
interface Reducer<T> {
    T reduce(List<T> list);
}

// Класс
class Task6 {
    private List<String> stringList;
    private List<Integer> intList;
    private List<List<Integer>> listOfIntLists;

    // Конструктор
    public Task6(List<String> stringList, List<Integer> intList, List<List<Integer>> listOfIntLists) {
        this.stringList = stringList;
        this.intList = intList;
        this.listOfIntLists = listOfIntLists;
    }

    // Обобщенный метод для сокращения списка значений
    public static <T> T reduceList(List<T> list, Reducer<T> reducer) {
        if (list == null || list.isEmpty()) {
            return null; // Возвращаем null, если список пуст или null
        }
        return reducer.reduce(list);
    }

    @Override
    public String toString() {
        return "Task6{" +
                "stringList=" + stringList +
                ", intList=" + intList +
                ", listOfIntLists=" + listOfIntLists +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пример 1: Список строк -> Сформировать одну большую строку
        List<String> stringList = new ArrayList<>();
        System.out.println("Введите три строки:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            stringList.add(scanner.nextLine());
        }

        String concatenatedString = reduceList(stringList, list -> {
            StringBuilder sb = new StringBuilder();
            for (String str : list) {
                sb.append(str);
            }
            return sb.toString();
        });
        System.out.println("Объединенная строка: " + concatenatedString);

        // Пример 2: Список целых чисел -> Вернуть сумму всех значений
        List<Integer> intList = new ArrayList<>();
        System.out.println("Введите три целых числа:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            intList.add(scanner.nextInt());
        }
        scanner.nextLine(); // Очистка буфера

        Integer sum = reduceList(intList, list -> {
            int total = 0;
            for (int num : list) {
                total += num;
            }
            return total;
        });
        System.out.println("Сумма целых чисел: " + sum);

        // Пример 3: Список списков целых чисел -> Вернуть общее количество элементов
        List<List<Integer>> listOfIntLists = new ArrayList<>();
        System.out.println("Введите три списка целых чисел (разделенные пробелами):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Список " + (i + 1) + ": ");
            String[] input = scanner.nextLine().split(" ");
            List<Integer> innerList = new ArrayList<>();
            for (String num : input) {
                innerList.add(Integer.parseInt(num));
            }
            listOfIntLists.add(innerList);
        }       List<Integer> totalElements = reduceList(listOfIntLists, list -> {
            int count = 0;
            for (List<Integer> innerList : list) {
                count += innerList.size();
            }
            return Collections.singletonList(count);
        });


        System.out.println("Общее количество элементов: " + totalElements);
    }
}