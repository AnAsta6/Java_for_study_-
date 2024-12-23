
public class Line {
    private Point start; // Объявляем приватное поле для хранения начальной точки линии
    private Point end; // Объявляем приватное поле для хранения конечной точки линии

    // Конструктор класса Line, принимающий начальную и конечную точки
    public Line(Point start, Point end) {
        this.start = start; // Инициализируем поле start переданным значением
        this.end = end; // Инициализируем поле end переданным значением
    }

    // Геттер для получения начальной точки
    public Point getStart() {
        return start; // Возвращаем значение поля start
    }

    // Геттер для получения конечной точки
    public Point getEnd() {
        return end; // Возвращаем значение поля end
    }

    // Сеттер для установки нового значения конечной точки
    public void setEnd(Point end) {
        this.end = end; // Устанавливаем новое значение поля end
    }

    // Сеттер для установки нового значения начальной точки
    public void setStart(Point start) {
        this.start = start; // Устанавливаем новое значение поля start
    }

    // Переопределяем метод toString для корректного отображения объекта Line
    @Override
    public String toString() {
        return "Линия от " + start + " до " + end; // Возвращаем строку, форматированную с начальной и конечной точками
    }
}
