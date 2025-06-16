package ru.example.lab.geometry;

/**
 * Класс, реализующий геометрическую фигуру "Прямоугольник".
 * Содержит базовые характеристики прямоугольника и методы для работы с ним.
 */
public class Rectangle implements Shape {
    // Левая верхняя точка прямоугольника
    private Point2D topLeft;

    // Ширина прямоугольника
    private double width;

    // Высота прямоугольника
    private double height;

    /**
     * Конструктор по умолчанию для создания экземпляра прямоугольника.
     * Инициализирует поля класса.
     */
    public Rectangle() {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    /**
     * Вычисляет площадь прямоугольника.
     * Формула: ширина * высота.
     *
     * @return значение площади прямоугольника
     */
    @Override
    public double area() {
        return width * height; // Площадь прямоугольника
    }

    /**
     * Возвращает строковое представление прямоугольника.
     *
     * @return строка с описанием ширины, высоты и площади прямоугольника
     */
    @Override
    public String toString() {
        return "Прямоугольник с шириной " + width + ", высотой " + height + " и площадью " + area();
    }
}