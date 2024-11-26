// 3.4
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

// Интерфейс для объекта с методом collect
interface Collector<T, P> {
    P collect(List<T> list);
}

// Класс для задания 7
class Task7 {
    private List<Integer> intList;
    private List<String> stringList;

    // Конструктор
    public Task7(List<Integer> intList, List<String> stringList) {
        this.intList = intList;
        this.stringList = stringList;
    }

    // Обобщенный метод для коллекционирования значений
    public static <T, P> P collectValues(List<T> list, Supplier<P> collectionSupplier, Function<T, P> valueAdder) {
        P collection = collectionSupplier.get();
        for (T item : list) {
            valueAdder.apply(item);
        }
        return collection;
    }

    @Override
    public String toString() {
        return "Task7{" +
                "intList=" + intList +
                ", stringList=" + stringList +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пример 1: Список целых чисел -> Разбить на два подсписка: положительные и отрицательные числа
        List<Integer> intList = new ArrayList<>();
        System.out.println("Введите четыре целых числа:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            intList.add(scanner.nextInt());
        }
        scanner.nextLine(); // Очистка буфера

        Map<Boolean, List<Integer>> partitionedInts = new HashMap<>();
        collectValues(intList,
                HashMap::new,
                num -> {
                    partitionedInts.computeIfAbsent(num > 0, k -> new ArrayList<>()).add(num);
                    return partitionedInts;
                });
        System.out.println("Положительные числа: " + partitionedInts.get(true));
        System.out.println("Отрицательные числа: " + partitionedInts.get(false));

        // Пример 2: Список строк -> Разбить на подсписки по длине строк
        List<String> stringList = new ArrayList<>();
        System.out.println("Введите четыре строки:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            stringList.add(scanner.nextLine());
        }

        Map<Integer, List<String>> groupedStrings = new HashMap<>();
        collectValues(stringList,
                HashMap::new,
                str -> {
                    groupedStrings.computeIfAbsent(str.length(), k -> new ArrayList<>()).add(str);
                    return groupedStrings;
                });
        System.out.println("Строки, сгруппированные по длине: " + groupedStrings);

        // Пример 3: Список строк -> Вернуть набор без дубликатов
        List<String> uniqueStringList = new ArrayList<>();
        System.out.println("Введите четыре строки:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            uniqueStringList.add(scanner.nextLine());
        }

        Set<String> uniqueStrings = new HashSet<>();
        collectValues(uniqueStringList,
                HashSet::new,
                str -> {
                    uniqueStrings.add(str);
                    return uniqueStrings;
                });
        System.out.println("Уникальные строки: " + uniqueStrings);
    }
}
