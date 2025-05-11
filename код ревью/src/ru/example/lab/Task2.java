package ru.example.lab;

/**
 * Представляет линию на двумерной плоскости, заданную начальной и конечной точками.
 */
public class Task2 {
    private Task1 startPoint; // Начальная точка линии
    private Task1 endPoint;   // Конечная точка линии

    /**
     * Создаёт линию с указанными начальной и конечной точками.
     * @param startPoint Начальная точка.
     * @param endPoint Конечная точка.
     */
    public Task2(Task1 startPoint, Task1 endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    /**
     * Возвращает текстовое представление линии в формате "Линия от {X1;Y1} до {X2;Y2}".
     * @return Текстовое представление линии.
     */
    @Override
    public String toString() {
        return "Линия от " + startPoint + " до " + endPoint;
    }

    /**
     * Возвращает начальную точку линии.
     * @return Начальная точка.
     */
    public Task1 getStartPoint() {
        return startPoint;
    }

    /**
     * Возвращает конечную точку линии.
     * @return Конечная точка.
     */
    public Task1 getEndPoint() {
        return endPoint;
    }

    /**
     * Устанавливает начальную точку линии.
     * @param startPoint Начальная точка.
     */
    public void setStartPoint(Task1 startPoint) {
        this.startPoint = startPoint;
    }

    /**
     * Устанавливает конечную точку линии.
     * @param endPoint Конечная точка.
     */
    public void setEndPoint(Task1 endPoint) {
        this.endPoint = endPoint;
    }
}
