package ru.example.lab.geometry;

/**
 * Класс для представления точки в трехмерном пространстве.
 * Содержит координаты x, y, z и методы для работы с ними.
 */
public class Task3 {
    private double x; // Координата X точки
    private double y; // Координата Y точки
    private double z; // Координата Z точки

    /**
     * Конструктор создает точку с заданными координатами.
     *
     * @param x координата по оси X
     * @param y координата по оси Y
     * @param z координата по оси Z
     */
    public Task3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Возвращает строковое представление точки в формате {x;y;z}.
     *
     * @return строковое представление точки
     */
    @Override
    public String toString() {
        return "{" + x + ";" + y + ";" + z + "}";
    }

    /**
     * Возвращает координату X точки.
     *
     * @return координата X
     */
    public double getX() {
        return x;
    }

    /**
     * Устанавливает новое значение координаты X.
     *
     * @param x новое значение координаты X
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Возвращает координату Y точки.
     *
     * @return координата Y
     */
    public double getY() {
        return y;
    }

    /**
     * Устанавливает новое значение координаты Y.
     *
     * @param y новое значение координаты Y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Возвращает координату Z точки.
     *
     * @return координата Z
     */
    public double getZ() {
        return z;
    }

    /**
     * Устанавливает новое значение координаты Z.
     *
     * @param z новое значение координаты Z
     */
    public void setZ(double z) {
        this.z = z;
    }
}