package ru.example.lab;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите номер задания (1-6) или введите 0 для выхода:");
            int taskNumber = scanner.nextInt();

            if (taskNumber == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            switch (taskNumber) {
                case 1:

                    //Task1
                    // Задание 1.1

                    System.out.println("задание 1.1");
                    System.out.println("\n Введите координаты для трех точек");

                    System.out.print("Введите координату X для первой точки: ");
                    double x1 = scanner.nextDouble();
                    System.out.print("Введите координату Y для первой точки: ");
                    double y1 = scanner.nextDouble();
                    Task1 point1 = new Task1(x1, y1);

                    System.out.print("Введите координату X для второй точки: ");
                    double x2 = scanner.nextDouble();
                    System.out.print("Введите координату Y для второй точки: ");
                    double y2 = scanner.nextDouble();
                    Task1 point2 = new Task1(x2, y2);

                    System.out.print("Введите координату X для третьей точки: ");
                    double x3 = scanner.nextDouble();
                    System.out.print("Введите координату Y для третьей точки: ");
                    double y3 = scanner.nextDouble();
                    Task1 point3 = new Task1(x3, y3);

                    // Вывод текстового представления точек
                    System.out.println("Точка 1: " + point1.toString());
                    System.out.println("Точка 2: " + point2.toString());
                    System.out.println("Точка 3: " + point3.toString());
                    break;

                case 2:

                //Task2
                // Задание 2.1

                    System.out.println("задание 2.1\n");
                    System.out.println("Программа создает три линии на двумерной плоскости.\n" +
                            "Вы должны ввести координаты начальной и конечной точек для первых двух линий.\n" +
                            "Третья линия автоматически начинается там же, где начинается первая линия, и заканчивается там же, где заканчивается вторая линия.\n" +
                            "Программа изменяет координаты первых двух линий и обновляет третью линию соответственно.\n" +
                            "Затем программа изменяет координаты первой линии так, чтобы координаты третьей линии остались неизменными.\n" +
                            "Программа выводит текстовое представление всех трех линий после каждого изменения.");
                    System.out.println("\n Введите координаты для линий");

                    System.out.print("Введите координату X для начала линии 1: ");
                    double xStart1 = scanner.nextDouble();
                    System.out.print("Введите координату Y для начала линии 1: ");
                    double yStart1 = scanner.nextDouble();
                    System.out.print("Введите координату X для конца линии 1: ");
                    double xEnd1 = scanner.nextDouble();
                    System.out.print("Введите координату Y для конца линии 1: ");
                    double yEnd1 = scanner.nextDouble();
                    Task1 startPoint1 = new Task1(xStart1, yStart1);
                    Task1 endPoint1 = new Task1(xEnd1, yEnd1);
                    Task2 line1 = new Task2(startPoint1, endPoint1);

                    System.out.print("Введите координату X для начала линии 2: ");
                    double xStart2 = scanner.nextDouble();
                    System.out.print("Введите координату Y для начала линии 2: ");
                    double yStart2 = scanner.nextDouble();
                    System.out.print("Введите координату X для конца линии 2: ");
                    double xEnd2 = scanner.nextDouble();
                    System.out.print("Введите координату Y для конца линии 2: ");
                    double yEnd2 = scanner.nextDouble();
                    Task1 startPoint2 = new Task1(xStart2, yStart2);
                    Task1 endPoint2 = new Task1(xEnd2, yEnd2);
                    Task2 line2 = new Task2(startPoint2, endPoint2);

                    // Линия 3 начинается там же, где начинается линия 1, и заканчивается там же, где заканчивается линия 2
                    Task2 line3 = new Task2(startPoint1, endPoint2);

                    // Вывод текстового представления линий
                    System.out.println("Линия 1: " + line1.toString());
                    System.out.println("Линия 2: " + line2.toString());
                    System.out.println("Линия 3: " + line3.toString());

                    // Изменение координат первой и второй линий
                    System.out.println("Изменим координаты первой и второй линий:");
                    startPoint1.setX(5);
                    startPoint1.setY(5);
                    endPoint1.setX(15);
                    endPoint1.setY(15);
                    startPoint2.setX(10);
                    startPoint2.setY(10);
                    endPoint2.setX(30);
                    endPoint2.setY(30);

                    // Вывод текстового представления линий после изменения
                    System.out.println("Линия 1 после изменения: " + line1.toString());
                    System.out.println("Линия 2 после изменения: " + line2.toString());
                    System.out.println("Линия 3 после изменения: " + line3.toString());

                    // Изменение координат первой линии так, чтобы не изменились координаты третьей линии
                    System.out.println("Изменим координаты первой линии так, чтобы не изменились координаты третьей линии:");
                    startPoint1.setX(0);
                    startPoint1.setY(0);
                    endPoint1.setX(10);
                    endPoint1.setY(10);

                    // Вывод текстового представления линий после изменения
                    System.out.println("Линия 1 после изменения: " + line1.toString());
                    System.out.println("Линия 2 после изменения: " + line2.toString());
                    System.out.println("Линия 3 после изменения: " + line3.toString());
                    break;

                case 3:

                    //Task3
                    // Задание 3.1

                    System.out.println("задание 3.1");
                    System.out.println("Табель Студентов и их оценок");

                    List<Task3> students = new ArrayList<>(); // Список для хранения студентов
                    while (true) {
                        System.out.println("Выберите действие:");
                        System.out.println("1. Добавить студента");
                        System.out.println("2. Изменить оценку студента");
                        System.out.println("3. Создать нового студента, скопировав оценки у другого студента");
                        System.out.println("4. Вывести всех студентов и их оценки");
                        System.out.println("0. Выйти из задания 3");
                        int action = scanner.nextInt();

                        if (action == 0) {
                            break;
                        }

                        switch (action) {
                            case 1:
                                // Добавление нового студента
                                System.out.print("Введите имя студента: ");
                                String name = scanner.next();
                                int[] grades = new int[3];
                                System.out.print("Введите первую оценку: ");
                                grades[0] = scanner.nextInt();
                                System.out.print("Введите вторую оценку: ");
                                grades[1] = scanner.nextInt();
                                System.out.print("Введите третью оценку: ");
                                grades[2] = scanner.nextInt();
                                Task3 newStudent = new Task3(name, grades);
                                students.add(newStudent);
                                System.out.println("Студент добавлен: " + newStudent.toString());
                                break;

                            case 2:
                                // Изменение оценки студента
                                System.out.print("Введите номер студента (начиная с 1): ");
                                int studentIndex = scanner.nextInt() - 1;
                                if (studentIndex >= 0 && studentIndex < students.size()) {
                                    Task3 studentToEdit = students.get(studentIndex);
                                    System.out.print("Введите номер оценки для изменения (1, 2 или 3): ");
                                    int gradeIndex = scanner.nextInt() - 1;
                                    System.out.print("Введите новую оценку: ");
                                    int newGrade = scanner.nextInt();
                                    studentToEdit.changeGrade(gradeIndex, newGrade);
                                    System.out.println("Оценка изменена: " + studentToEdit.toString());
                                } else {
                                    System.out.println("Неверный номер студента.");
                                }
                                break;

                            case 3:
                                // Создание нового студента, скопировав оценки у другого студента
                                System.out.print("Введите имя нового студента: ");
                                String newStudentName = scanner.next();
                                System.out.print("Введите номер студента, у которого скопировать оценки (начиная с 1): ");
                                int sourceStudentIndex = scanner.nextInt() - 1;
                                if (sourceStudentIndex >= 0 && sourceStudentIndex < students.size()) {
                                    Task3 sourceStudent = students.get(sourceStudentIndex);
                                    int[] copiedGrades = Arrays.copyOf(sourceStudent.getGrades(), sourceStudent.getGrades().length);
                                    Task3 copiedStudent = new Task3(newStudentName, copiedGrades);
                                    students.add(copiedStudent);
                                    System.out.println("Новый студент добавлен: " + copiedStudent.toString());
                                } else {
                                    System.out.println("Неверный номер студента.");
                                }
                                break;

                            case 4:
                                // Вывод всех студентов и их оценок
                                System.out.println("Список всех студентов и их оценок:");
                                for (Task3 student : students) {
                                    System.out.println(student.toString());
                                }
                                break;

                            default:
                                System.out.println("Неверный выбор действия.");
                                break;
                        }
                    }
                    break;

                case 4:
                    // Task4
                    // Задание 4.1
                    System.out.println("задание 4.1");
                    System.out.println("Создаем Точку.");

                    System.out.println("Введите координаты для первой точки:");
                    System.out.print("Введите координату X: ");
                    double x1_task4 = scanner.nextDouble();
                    System.out.print("Введите координату Y: ");
                    double y1_task4 = scanner.nextDouble();
                    Task1 point1_task4 = new Task1(x1_task4, y1_task4);
                    System.out.println(point1_task4.toString());

                    System.out.println("Введите координаты для второй точки:");
                    System.out.print("Введите координату X: ");
                    double x2_task4 = scanner.nextDouble();
                    System.out.print("Введите координату Y: ");
                    double y2_task4 = scanner.nextDouble();
                    Task1 point2_task4 = new Task1(x2_task4, y2_task4);
                    System.out.println(point2_task4.toString());

                    System.out.println("Введите координаты для третьей точки:");
                    System.out.print("Введите координату X: ");
                    double x3_task4 = scanner.nextDouble();
                    System.out.print("Введите координату Y: ");
                    double y3_task4 = scanner.nextDouble();
                    Task1 point3_task4 = new Task1(x3_task4, y3_task4);
                    System.out.println(point3_task4.toString());
                    break;

                case 5:

                    // Task5
                    // Задание 4.7
                    System.out.println("задание 4.7");
                    System.out.println("Табель Студентов и их оценок");
                    List<Task5> studentsTask5 = new ArrayList<>(); // Список для хранения студентов Task5
                    while (true) {
                        System.out.println("Выберите действие:");
                        System.out.println("1. Добавить студента");
                        System.out.println("2. Изменить оценку студента");
                        System.out.println("3. Создать нового студента, скопировав оценки у другого студента");
                        System.out.println("4. Вывести всех студентов и их оценки");
                        System.out.println("0. Выйти из задания 5");
                        int action = scanner.nextInt();
                        if (action == 0) {
                            break;
                        }
                        switch (action) {
                            case 1:
                                // Добавление нового студента
                                System.out.print("Введите имя студента: ");
                                String name = scanner.next();
                                System.out.print("Введите количество оценок (0, если оценок нет): ");
                                int numGrades = scanner.nextInt();
                                int[] grades = new int[numGrades];
                                for (int i = 0; i < numGrades; i++) {
                                    System.out.print("Введите оценку " + (i + 1) + ": ");
                                    grades[i] = scanner.nextInt();
                                }
                                Task5 newStudent = new Task5(name, grades);
                                studentsTask5.add(newStudent);
                                System.out.println("Студент добавлен: " + newStudent.toString());
                                break;
                            case 2:
                                // Изменение оценки студента
                                System.out.print("Введите номер студента (начиная с 1): ");
                                int studentIndex = scanner.nextInt() - 1;
                                if (studentIndex >= 0 && studentIndex < studentsTask5.size()) {
                                    Task5 studentToEdit = studentsTask5.get(studentIndex);
                                    System.out.print("Введите номер оценки для изменения (начиная с 1): ");
                                    int gradeIndex = scanner.nextInt() - 1;
                                    System.out.print("Введите новую оценку: ");
                                    int newGrade = scanner.nextInt();
                                    studentToEdit.changeGrade(gradeIndex, newGrade);
                                    System.out.println("Оценка изменена: " + studentToEdit.toString());
                                } else {
                                    System.out.println("Неверный номер студента.");
                                }
                                break;
                            case 3:
                                // Создание нового студента, скопировав оценки у другого студента
                                System.out.print("Введите имя нового студента: ");
                                String newStudentName = scanner.next();
                                System.out.print("Введите номер студента, у которого скопировать оценки (начиная с 1): ");
                                int sourceStudentIndex = scanner.nextInt() - 1;
                                if (sourceStudentIndex >= 0 && sourceStudentIndex < studentsTask5.size()) {
                                    Task5 sourceStudent = studentsTask5.get(sourceStudentIndex);
                                    int[] copiedGrades = Arrays.copyOf(sourceStudent.getGrades(), sourceStudent.getGrades().length);
                                    Task5 copiedStudent = new Task5(newStudentName, copiedGrades);
                                    studentsTask5.add(copiedStudent);
                                    System.out.println("Новый студент добавлен: " + copiedStudent.toString());
                                } else {
                                    System.out.println("Неверный номер студента.");
                                }
                                break;
                            case 4:
                                // Вывод всех студентов и их оценок
                                System.out.println("Список всех студентов и их оценок:");
                                for (Task5 student : studentsTask5) {
                                    System.out.println(student.toString());
                                }
                                break;
                            default:
                                System.out.println("Неверный выбор действия.");
                                break;
                        }
                    }
                    break;

                case 6:
                    // Task6
                    // Задание 5.6

                    System.out.println("задание 6");
                    System.out.println("Табель Студентов и их оценок");
                    List<Task6> studentsTask6 = new ArrayList<>(); // Список для хранения студентов Task6
                    while (true) {
                        System.out.println("Выберите действие:");
                        System.out.println("1. Добавить студента");
                        System.out.println("2. Изменить оценку студента");
                        System.out.println("3. Создать нового студента, скопировав оценки у другого студента");
                        System.out.println("4. Вывести всех студентов и их оценки");
                        System.out.println("0. Выйти из задания 6");
                        int action = scanner.nextInt();
                        if (action == 0) {
                            break;
                        }
                        switch (action) {
                            case 1:
                                // Добавление нового студента
                                System.out.print("Введите имя студента: ");
                                String name = scanner.next();
                                System.out.print("Введите количество оценок (0, если оценок нет): ");
                                int numGrades = scanner.nextInt();
                                int[] grades = new int[numGrades];
                                for (int i = 0; i < numGrades; i++) {
                                    System.out.print("Введите оценку " + (i + 1) + ": ");
                                    grades[i] = scanner.nextInt();
                                }
                                Task6 newStudent = new Task6(name, grades);
                                studentsTask6.add(newStudent);
                                System.out.println("Студент добавлен: " + newStudent.toString());
                                break;
                            case 2:
                                // Изменение оценки студента
                                System.out.print("Введите номер студента (начиная с 1): ");
                                int studentIndex = scanner.nextInt() - 1;
                                if (studentIndex >= 0 && studentIndex < studentsTask6.size()) {
                                    Task6 studentToEdit = studentsTask6.get(studentIndex);
                                    System.out.print("Введите номер оценки для изменения (начиная с 1): ");
                                    int gradeIndex = scanner.nextInt() - 1;
                                    System.out.print("Введите новую оценку: ");
                                    int newGrade = scanner.nextInt();
                                    studentToEdit.changeGrade(gradeIndex, newGrade);
                                    System.out.println("Оценка изменена: " + studentToEdit.toString());
                                } else {
                                    System.out.println("Неверный номер студента.");
                                }
                                break;
                            case 3:
                                // Создание нового студента, скопировав оценки у другого студента
                                System.out.print("Введите имя нового студента: ");
                                String newStudentName = scanner.next();
                                System.out.print("Введите номер студента, у которого скопировать оценки (начиная с 1): ");
                                int sourceStudentIndex = scanner.nextInt() - 1;
                                if (sourceStudentIndex >= 0 && sourceStudentIndex < studentsTask6.size()) {
                                    Task6 sourceStudent = studentsTask6.get(sourceStudentIndex);
                                    int[] copiedGrades = Arrays.copyOf(sourceStudent.getGrades(), sourceStudent.getGrades().length);
                                    Task6 copiedStudent = new Task6(newStudentName, copiedGrades);
                                    studentsTask6.add(copiedStudent);
                                    System.out.println("Новый студент добавлен: " + copiedStudent.toString());
                                } else {
                                    System.out.println("Неверный номер студента.");
                                }
                                break;
                            case 4:
                                // Вывод всех студентов и их оценок
                                System.out.println("Список всех студентов и их оценок:");
                                for (Task6 student : studentsTask6) {
                                    System.out.println(student.toString());
                                }
                                break;
                            default:
                                System.out.println("Неверный выбор действия.");
                                break;
                        }
                    }
                    break;

                default:
                    System.out.println("Неверный номер задания. Пожалуйста, выберите номер от 1 до 6.");
                    break;
            }
        }

        scanner.close();
    }
}
