package ru.example.lab.geometry;

import java.util.List;

/**
 * Класс для работы с геометрическими фигурами, содержащий методы для вычисления суммарных характеристик.
 */
public class Task5 {

    /**
     * Вычисляет суммарную площадь всех фигур в списке.
     *
     * <p>Метод проходит по всем фигурам в переданном списке и суммирует их площади.
     * Если список пуст или равен null, возвращает 0.
     *
     * @param shapes список геометрических фигур, для которых нужно вычислить суммарную площадь
     * @return суммарная площадь всех фигур в списке. Возвращает 0, если список пуст или null
     */
    public static double totalArea(List<Shape> shapes) {
        if (shapes == null) {
            return 0;
        }

        double total = 0;
        for (Shape shape : shapes) {
            total += shape.area();
        }
        return total;
    }
}