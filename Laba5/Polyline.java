
import java.util.Arrays; // Импортируем класс Arrays для использования метода toString

public class Polyline {
    private Point[] points; // Объявляем приватное поле для хранения массива точек

    // Конструктор класса Polyline, принимающий массив точек
    public Polyline(Point[] points) {
        this.points = points; // Инициализируем поле points переданным значением
    }

    // Геттер для получения массива точек
    public Point[] getPoints() {
        return points; // Возвращаем значение поля points
    }

    // Переопределяем метод toString для корректного отображения объекта Polyline
    @Override
    public String toString() {
        return "Линия " + Arrays.toString(points); // Возвращаем строку, форматированную с массивом точек
    }
}