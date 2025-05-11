package ru.example.lab;

/**
 * Представляет точку на двумерной плоскости с координатами X и Y.
 */
public class Task1 {
    private double x; // Координата X точки
    private double y; // Координата Y точки

    /**
     * Создаёт точку с указанными координатами X и Y.
     * @param x Координата X.
     * @param y Координата Y.
     */
    public Task1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает текстовое представление точки в формате "{X;Y}".
     * @return Текстовое представление точки.
     */
    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }

    /**
     * Возвращает координату X точки.
     * @return Координата X.
     */
    public double getX() {
        return x;
    }

    /**
     * Возвращает координату Y точки.
     * @return Координата Y.
     */
    public double getY() {
        return y;
    }

    /**
     * Устанавливает координату X точки.
     * @param x Координата X.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Устанавливает координату Y точки.
     * @param y Координата Y.
     */
    public void setY(double y) {
        this.y = y;
    }
}
