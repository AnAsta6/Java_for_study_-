package ru.example.lab;

import java.util.Arrays;

/**
 * Представляет студента с именем и набором оценок.
 */
public class Task5 {
    private String name; // Имя студента
    private int[] grades; // Массив оценок студента

    /**
     * Создаёт студента с указанным именем и набором оценок.
     * @param name Имя студента.
     * @param grades Массив оценок студента.
     */
    public Task5(String name, int... grades) {
        this.name = name;
        if (grades != null) {
            this.grades = Arrays.copyOf(grades, grades.length);
        } else {
            this.grades = new int[0];
        }
    }

    /**
     * Возвращает имя студента.
     * @return Имя студента.
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя студента.
     * @param name Имя студента.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает массив оценок студента.
     * @return Массив оценок.
     */
    public int[] getGrades() {
        return grades;
    }

    /**
     * Устанавливает массив оценок студента.
     * @param grades Массив оценок.
     */
    public void setGrades(int[] grades) {
        if (grades != null) {
            this.grades = Arrays.copyOf(grades, grades.length);
        } else {
            this.grades = new int[0];
        }
    }

    /**
     * Изменяет оценку студента по указанному индексу.
     * @param index Индекс оценки.
     * @param newGrade Новая оценка.
     */
    public void changeGrade(int index, int newGrade) {
        if (index >= 0 && index < grades.length) {
            grades[index] = newGrade;
        }
    }

    /**
     * Возвращает текстовое представление студента в формате "Имя: [оценка1, оценка2, ..., оценкаN]".
     * @return Текстовое представление студента.
     */
    @Override
    public String toString() {
        return "Имя: " + name + ", Оценки: " + Arrays.toString(grades);
    }
}
