package ru.derevyannykh.list;


import java.util.ArrayList;
import java.util.List;

public class Task1 {
    private String name; // Имя студента
    private List<Integer> grades; // Список оценок студента

    // Конструктор для инициализации имени студента
    public Task1(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Геттер для имени студента
    public String getName() {
        return name;
    }

    // Метод для добавления оценки
    public boolean addGrade(int grade) {
        if (grade >= 2 && grade <= 5) {
            grades.add(grade);
            return true;
        } else {
            System.out.println("Ошибка: Оценка должна быть в диапазоне от 2 до 5.");
            return false;
        }
    }

    // Геттер для списка оценок студента
    public List<Integer> getGrades() {
        return grades;
    }

    // Метод для расчета средней оценки
    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Метод для определения, является ли студент отличником
    public boolean isExcellent() {
        if (grades.isEmpty()) {
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
        return "Имя: " + name + ", Оценки: " + grades +
                ", Средний балл: " + getAverageGrade() +
                ", Студент" + (isExcellent() ? "" : " Не") + " является отличником.";
    }
}