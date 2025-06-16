package ru.example.lab.geometry;

/**
 * Класс, представляющий геометрическую фигуру и её площадь.
 */
public class Task4 {
    /** Тип геометрической фигуры. */
    private String shapeType;

    /** Площадь геометрической фигуры. */
    private double area;

    /**
     * Создаёт новый экземпляр геометрической фигуры.
     *
     * @param shapeType тип создаваемой фигуры
     * @param area площадь создаваемой фигуры
     */
    public Task4(String shapeType, double area) {
        this.shapeType = shapeType;
        this.area = area;
    }

    /**
     * Возвращает строковое представление геометрической фигуры.
     *
     * @return строку в формате "Фигура: [тип], Площадь: [площадь]"
     */
    @Override
    public String toString() {
        return "Фигура: " + shapeType + ", Площадь: " + area;
    }

    /**
     * Возвращает тип геометрической фигуры.
     *
     * @return тип фигуры
     */
    public String getShapeType() {
        return shapeType;
    }

    /**
     * Возвращает площадь геометрической фигуры.
     *
     * @return площадь фигуры
     */
    public double getArea() {
        return area;
    }
}