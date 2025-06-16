package ru.example.lab.geometry;

/**
 * Класс, реализующий геометрическую фигуру "Квадрат".
 * Представляет собой прямоугольник с равными сторонами.
 */
public class Square implements Shape {
    // Левая верхняя точка квадрата
    private Point2D topLeft;

    // Длина стороны квадрата (должна быть положительной)
    private double side;

    /**
     * Создает новый квадрат с указанными параметрами.
     *
     * @param topLeft левая верхняя точка квадрата
     * @param side длина стороны квадрата
     */
    public Square(Point2D topLeft, double side) {
        this.topLeft = topLeft;
        this.side = side;
    }

    /**
     * Вычисляет площадь квадрата по формуле: сторона².
     *
     * @return площадь квадрата
     */
    @Override
    public double area() {
        return side * side;
    }

    /**
     * Возвращает строковое представление квадрата.
     *
     * @return строка с описанием стороны и площади квадрата
     */
    @Override
    public String toString() {
        return "Квадрат со стороной " + side + " и площадью " + area();
    }
}