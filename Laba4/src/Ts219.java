// для Task2
// Ts219.java
import java.util.ArrayList;
import java.util.List;

public class Ts219 implements Comparable<Ts219> {
    private String name; // Имя студента
    private List<Integer> grades; // Список оценок студента

    // Конструктор для инициализации имени студента
    public Ts219(String name) {
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

    // Реализация метода compare для сравнения студентов по средней оценке
    @Override
    public int compare(Ts219 other) {
        double thisAverage = this.getAverageGrade();
        double otherAverage = other.getAverageGrade();

        if (thisAverage > otherAverage) {
            return 1;
        } else if (thisAverage < otherAverage) {
            return -1;
        } else {
            return 0;
        }
    }
}
