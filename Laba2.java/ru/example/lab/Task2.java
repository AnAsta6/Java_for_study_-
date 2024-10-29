package ru.example.lab;

//Задание2.1

public class Task2 {
    private Task1 startPoint; // Координата начала линии
    private Task1 endPoint; // Координата конца линии

    // Конструктор класса Task2
    public Task2(Task1 startPoint, Task1 endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    // Переопределение метода toString для вывода текстового представления линии
    @Override
    public String toString() {
        return "Линия от " + startPoint.toString() + " до " + endPoint.toString();
    }

    // Геттеры для доступа к точкам
    public Task1 getStartPoint() {
        return startPoint;
    }

    public Task1 getEndPoint() {
        return endPoint;
    }

    // Сеттеры для изменения точек
    public void setStartPoint(Task1 startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Task1 endPoint) {
        this.endPoint = endPoint;
    }
}
