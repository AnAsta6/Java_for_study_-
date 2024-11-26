// 1.4
// Task2.java
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание первого студента
        System.out.print("Введите имя первого студента: ");
        String name1 = scanner.next();
        Ts219 student1 = new Ts219(name1);
        while (true) {
            System.out.print("Введите оценку для первого студента (или -1 для завершения ввода): ");
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }
            student1.addGrade(grade);
        }

        // Создание второго студента
        System.out.print("Введите имя второго студента: ");
        String name2 = scanner.next();
        Ts219 student2 = new Ts219(name2);
        while (true) {
            System.out.print("Введите оценку для второго студента (или -1 для завершения ввода): ");
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }
            student2.addGrade(grade);
        }

        // Сравнение студентов
        int comparisonResult = student1.compare(student2);

        // Вывод результатов
        System.out.println("Студент 1: " + student1);
        System.out.println("Студент 2: " + student2);
        System.out.println("Результат сравнения: " + comparisonResult);
    }
}
