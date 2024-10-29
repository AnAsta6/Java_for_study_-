package ru.example.lab;

//Задание 5.6

import java.util.Arrays;

public class Task6 {
    private String name; // Имя студента
    private int[] grades; // Массив оценок студента

    // Конструктор для инициализации имени и оценок студента
    public Task6(String name, int... grades) {
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

    // Метод для расчета средней оценки
    public double getAverageGrade() {
        if (grades.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Метод для определения, является ли студент отличником
    public boolean isExcellent() {
        if (grades.length == 0) {
            return false;
        }
        for (int grade : grades) {
            if (grade != 5) {
                return false;
            }
        }
        return true;
    }

    // Переопределение метода toString для вывода информации о студенте
    @Override
    public String toString() {
        return "Имя: " + name + ", Оценки: " + Arrays.toString(grades) +
                ", Средний балл: " + getAverageGrade() +
                ", Студент" + (isExcellent() ? "" : " Не") + " является отлиником." ;
    }
}
