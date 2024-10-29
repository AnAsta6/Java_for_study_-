package ru.example.lab;

//Задание 3.1

import java.util.Arrays;

public class Task3 {
    private String name; // Имя студента
    private int[] grades; // Массив оценок студента

    // Конструктор для инициализации имени и оценок студента
    public Task3(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    // Геттер для имени студента
    public String getName() {
        return name;
    }

    // Сеттер для имени студента
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для массива оценок студента
    public int[] getGrades() {
        return grades;
    }

    // Сеттер для массива оценок студента
    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    // Метод для изменения оценки студента по индексу
    public void changeGrade(int index, int newGrade) {
        if (index >= 0 && index < grades.length) {
            grades[index] = newGrade;
        }
    }

    // Переопределение метода toString для вывода информации о студенте
    @Override
    public String toString() {
        return "Имя: " + name + ", Оценки: " + Arrays.toString(grades);
    }
}
