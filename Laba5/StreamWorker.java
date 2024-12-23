// Задание 7.2

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamWorker {
    // Метод для выполнения первого задания
    public static Polyline firstTask(Point[] points) {
        // Преобразуем массив точек в поток
        return new Polyline(Arrays.stream(points)
                .distinct() // Удаляем дубликаты
                .filter(point -> point.getX() != point.getY()) // Фильтруем точки, у которых координаты X и Y не равны
                .map(point -> new Point(point.getX(), Math.abs(point.getY()))) // Преобразуем координату Y в её абсолютное значение
                .sorted(Comparator.comparingDouble(Point::getX)) // Сортируем точки по координате X
                .toArray(Point[]::new)); // Преобразуем поток обратно в массив точек
    }

    // Метод для выполнения второго задания
    public static Map<Integer, List<String>> secondTask(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) { // Открываем файл для чтения
            return reader.lines() // Читаем строки из файла
                    .map(line -> line.split(":")) // Разбиваем строки на части по символу ":"
                    .filter(parts -> parts.length == 2 && !parts[1].trim().isEmpty()) // Фильтруем строки, у которых есть две части и вторая часть не пустая
                    .map(parts -> parts[0].substring(0, 1).toUpperCase() + parts[0].substring(1).toLowerCase() + ":" + parts[1].trim()) // Преобразуем первую часть строки в CamelCase
                    .map(line -> line.split(":")) // Разбиваем строки на части по символу ":"
                    .collect(Collectors.groupingBy( // Группируем строки по второй части
                            parts -> Integer.parseInt(parts[1].trim()), // Преобразуем вторую часть в целое число
                            Collectors.mapping( // Преобразуем первую часть в список
                                    parts -> parts[0],
                                    Collectors.toList()
                            )));
        } catch (Exception e) { // Обрабатываем исключения
            e.printStackTrace();
        }
        return Map.of(); // Возвращаем пустую карту в случае ошибки
    }
}