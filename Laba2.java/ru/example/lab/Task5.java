package ru.example.lab;

//Задание 4.7

import java.util.Arrays;

public class Task5 {
    private String name; // Имя студента
    private int[] grades; // Массив оценок студента

    // Конструктор для инициализации имени и оценок студента
    public Task5(String name, int... grades) {
        this.name = name;
        if (grades != null) {
            this.grades = Arrays.copyOf(grades, grades.length);
        } else {
            this.grades = new int[0];
        }
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
        if (grades != null) {
            this.grades = Arrays.copyOf(grades, grades.length);
        } else {
            this.grades = new int[0];
        }
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
