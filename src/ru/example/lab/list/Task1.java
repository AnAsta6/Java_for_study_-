package ru.example.lab.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для хранения и обработки данных студента, включая имя и список оценок.
 *
 * <p>Предоставляет функциональность для:
 * <ul>
 *   <li>Добавления и валидации оценок</li>
 *   <li>Расчёта среднего балла</li>
 *   <li>Проверки статуса "отличник"</li>
 * </ul>
 */
public class Task1 {
    private final String name; // Имя студента, не может быть null после инициализации
    private final List<Integer> grades; // Список оценок (допустимые значения: 2, 3, 4, 5)

    /**
     * Конструктор создает нового студента с указанным именем.
     *
     * @param name имя студента (должно содержать как минимум 1 не-whitespace символ)
     * @throws IllegalArgumentException если имя null или пустое
     */
    public Task1(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    /**
     * Возвращает имя студента.
     *
     * @return имя студента (гарантированно не null)
     */
    public String getName() {
        return name;
    }

    /**
     * Добавляет новую оценку после проверки её валидности.
     *
     * @param grade добавляемая оценка (должна быть в диапазоне 2-5)
     * @return true если оценка была добавлена, false если оценка невалидна
     */
    public boolean addGrade(int grade) {
        if (grade >= 2 && grade <= 5) {
            grades.add(grade);
            return true;
        }
        System.out.println("Ошибка: Оценка должна быть в диапазоне от 2 до 5.");
        return false;
    }

    /**
     * Возвращает неизменяемый список оценок студента.
     *
     * @return список оценок (не null, может быть пустым)
     */
    public List<Integer> getGrades() {
        return new ArrayList<>(grades); // Возвращаем копию для защиты от изменений
    }

    /**
     * Вычисляет средний балл студента.
     *
     * @return среднее арифметическое всех оценок (0.0 если оценок нет)
     */
    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    /**
     * Проверяет, является ли студент отличником (все оценки равны 5).
     *
     * @return true если все оценки = 5 (и есть хотя бы одна оценка), false в других случаях
     */
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

    /**
     * Возвращает строковое представление данных студента.
     *
     * @return строка формата: "Имя: [name], Оценки: [grades], Средний балл: [average], Статус отличника"
     */
    @Override
    public String toString() {
        return String.format(
                "Имя: %s, Оценки: %s, Средний балл: %.2f, Студент%s является отличником.",
                name,
                grades,
                getAverageGrade(),
                isExcellent() ? "" : " Не"
        );
    }
}