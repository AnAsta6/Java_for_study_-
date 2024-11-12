package ru.derevyannykh.main;

// Лабораторная номер 3

import ru.derevyannykh.geometry.*;
import ru.derevyannykh.list.Task1;
import ru.derevyannykh.list.Task2;

import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    static Main m = new Main();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите номер задания (1-11) или введите 0 для выхода:");
            int taskNumber = scanner.nextInt();

            if (taskNumber == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            switch (taskNumber) {
                case 1:
                    // Задание 1.9
                    List<Task1> studentsTask1 = new ArrayList<>(); // Список для хранения студентов Task1

                    while (true) {
                        System.out.println("Выберите действие:");
                        System.out.println("1. Добавить студента");
                        System.out.println("2. Изменить оценку студента");
                        System.out.println("3. Создать нового студента, скопировав оценки у другого студента");
                        System.out.println("4. Вывести всех студентов и их оценки");
                        System.out.println("0. Выйти из задания 1");
                        int action = scanner.nextInt();

                        if (action == 0) {
                            System.out.println("Выход из задания 1.");
                            break;
                        }

                        switch (action) {
                            case 1:
                                // Добавление нового студента
                                System.out.print("Введите имя студента: ");
                                String name = scanner.next();
                                Task1 newStudent = new Task1(name);
                                while (true) {
                                    System.out.print("Введите оценку (или -1 для завершения ввода): ");
                                    int grade = scanner.nextInt();
                                    if (grade == -1) {
                                        break;
                                    }
                                    newStudent.addGrade(grade);
                                }
                                studentsTask1.add(newStudent);
                                System.out.println("Студент добавлен: " + newStudent.toString());
                                break;

                            case 2:
                                // Изменение оценки студента
                                System.out.print("Введите номер студента (начиная с 1): ");
                                int studentIndex = scanner.nextInt() - 1;
                                if (studentIndex >= 0 && studentIndex < studentsTask1.size()) {
                                    Task1 studentToEdit = studentsTask1.get(studentIndex);
                                    System.out.print("Введите новую оценку: ");
                                    int newGrade = scanner.nextInt();
                                    studentToEdit.addGrade(newGrade);
                                    System.out.println("Оценка добавлена: " + studentToEdit.toString());
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
                                if (sourceStudentIndex >= 0 && sourceStudentIndex < studentsTask1.size()) {
                                    Task1 sourceStudent = studentsTask1.get(sourceStudentIndex);
                                    Task1 copiedStudent = new Task1(newStudentName);
                                    for (int grade : sourceStudent.getGrades()) {
                                        copiedStudent.addGrade(grade);
                                    }
                                    studentsTask1.add(copiedStudent);
                                    System.out.println("Новый студент добавлен: " + copiedStudent.toString());
                                } else {
                                    System.out.println("Неверный номер студента.");
                                }
                                break;

                            case 4:
                                // Вывод всех студентов и их оценок
                                System.out.println("Список всех студентов и их оценок:");
                                for (Task1 student : studentsTask1) {
                                    System.out.println(student.toString());
                                }
                                break;

                            default:
                                System.out.println("Неверный выбор действия.");
                                break;
                        }
                    }
                    break;

                case 2:
                    // Задание 2.3
                    Task2 phoneBook = new Task2();

                    while (true) {
                        System.out.println("Выберите действие:");
                        System.out.println("1. Добавить контакт");
                        System.out.println("2. Удалить контакт");
                        System.out.println("3. Получить телефон по имени");
                        System.out.println("4. Вывести все контакты");
                        System.out.println("5. Проверить наличие телефона");
                        System.out.println("6. Проверить наличие имени");
                        System.out.println("7. Получить количество контактов");
                        System.out.println("8. Получить все телефоны");
                        System.out.println("9 . Получить все имена");
                        System.out.println("10. Получить имена по префиксу");
                        System.out.println("0. Выход из задания 2");

                        int action = scanner.nextInt();
                        scanner.nextLine(); // Очистка буфера

                        if (action == 0) {
                            System.out.println("Выход из задания 2");
                            break;
                        }

                        switch (action) {
                            case 1:
                                System.out.print("Введите телефон: ");
                                String phone = scanner.nextLine();
                                System.out.print("Введите имя: ");
                                String name = scanner.nextLine();
                                String oldPhone = phoneBook.addContact(phone, name);
                                if (oldPhone != null) {
                                    System.out.println("Контакт добавлен. Старый телефон: " + oldPhone);
                                } else {
                                    System.out.println("Контакт добавлен.");
                                }
                                break;

                            case 2:
                                System.out.print("Введите имя для удаления: ");
                                String nameToRemove = scanner.nextLine();
                                String removedPhone = phoneBook.removeContact(nameToRemove);
                                if (removedPhone != null) {
                                    System.out.println("Контакт удален. Телефон: " + removedPhone);
                                } else {
                                    System.out.println("Контакт не найден.");
                                }
                                break;

                            case 3:
                                System.out.print("Введите имя для получения телефона: ");
                                String nameToFind = scanner.nextLine();
                                String foundPhone = phoneBook.getPhoneByName(nameToFind);
                                if (foundPhone != null) {
                                    System.out.println("Телефон: " + foundPhone);
                                } else {
                                    System.out.println("Контакт не найден.");
                                }
                                break;

                            case 4:
                                System.out.println("Все контакты:");
                                System.out.println(phoneBook);
                                break;

                            case 5:
                                System.out.print("Введите телефон для проверки: ");
                                String phoneToCheck = scanner.nextLine();
                                boolean phoneExists = phoneBook.hasPhone(phoneToCheck);
                                System.out.println("Телефон " + (phoneExists ? "найден" : "не найден") + ".");
                                break;

                            case 6:
                                System.out.print("Введите имя для проверки: ");
                                String nameToCheck = scanner.nextLine();
                                boolean nameExists = phoneBook.hasName(nameToCheck);
                                System.out.println("Имя " + (nameExists ? "найдено" : "не найдено") + ".");
                                break;

                            case 7:
                                System.out.println("Количество контактов: " + phoneBook.getContactCount());
                                break;

                            case 8:
                                System.out.println("Все телефоны: " + Arrays.toString(phoneBook.getAllPhones()));
                                break;

                            case 9:
                                System.out.println("Все имена: " + Arrays.toString(phoneBook.getAllNames()));
                                break;

                            case 10:
                                System.out.print("Введите префикс для поиска имен: ");
                                String prefix = scanner.nextLine();
                                System.out.println("Имена, начинающиеся на '" + prefix + "': " + Arrays.toString(phoneBook.getNamesByPrefix(prefix)));
                                break;

                            default:
                                System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
                        }
                    }
                    break;

                case 3:
                    // Задание 3.5
                    // Работа с трехмерной точкой
                    double x = 0, y = 0, z = 0;

                    // Ввод координаты X
                    while (true) {
                        try {
                            System.out.print("Введите координату X: ");
                            x = scanner.nextDouble();
                            break; // Выход из цикла, если ввод корректен
                        } catch (InputMismatchException e) {
                            System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                            scanner.next(); // Очистка некорректного ввода
                        }
                    }

                    // Ввод координаты Y
                    while (true) {
                        try {
                            System.out.print("Введите координату Y: ");
                            y = scanner.nextDouble();
                            break; // Выход из цикла, если ввод корректен
                        } catch (InputMismatchException e) {
                            System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                            scanner.next(); // Очистка некорректного ввода
                        }
                    }

                    // Ввод координаты Z
                    while (true) {
                        try {
                            System.out.print("Введите координату Z: ");
                            z = scanner.nextDouble();
                            break; // Выход из цикла, если ввод корректен
                        } catch (InputMismatchException e) {
                            System.out.println("Ошибка ввода! Пожалуйста, введите число, если Вы вводите дробное число, то используйте запятую.");
                            scanner.next(); // Очистка некорректного ввода
                        }
                    }

                    // Создание объекта Task3 с введенными координатами
                    Task3 point = new Task3(x, y, z);

                    // Вывод информации о точке
                    System.out.println("Введенная трехмерная точка: " + point.toString());
                    break;

                case 4:
                    // Задание 4.4
                    // Работа с фигурами
                    while (true) {
                        System.out.println("Выберите фигуру для создания (1 - Круг, 2 - Квадрат, 3 - Прямоугольник, 4 - Треугольник, 0 - Выход):");
                        int choice = scanner.nextInt();

                        if (choice == 0) {
                            System.out.println("Выход из задания 4.");
                            break;
                        }

                        Task4 shape = null;

                        switch (choice) {
                            case 1:
                                double radius = 0;
                                while (true) {
                                    try {
                                        System.out.print("Введите радиус круга: ");
                                        radius = scanner.nextDouble();
                                        if (radius <= 0) {
                                            System.out.println("Радиус должен быть положительным числом. Попробуйте снова.");
                                            continue;
                                        }
                                        break; // Выход из цикла, если ввод корректен
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                                        scanner.next(); // Очистка некорректного ввода
                                    }
                                }
                                double circleArea = Math.PI * radius * radius;
                                shape = new Task4("Круг", circleArea);
                                break;

                            case 2:
                                double side = 0;
                                while (true) {
                                    try {
                                        System.out.print("Введите сторону квадрата: ");
                                        side = scanner.nextDouble();
                                        if (side <= 0) {
                                            System.out.println("Сторона должна быть положительным числом. Попробуйте снова.");
                                            continue;
                                        }
                                        break; // Выход из цикла, если ввод корректен
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                                        scanner.next(); // Очистка некорректного ввода
                                    }
                                }
                                double squareArea = side * side;
                                shape = new Task4("Квадрат", squareArea);
                                break;

                            case 3:
                                double width = 0, height = 0;
                                while (true) {
                                    try {
                                        System.out.print("Введите ширину прямоугольника: ");
                                        width = scanner.nextDouble();
                                        if (width <= 0) {
                                            System.out.println("Ширина должна быть положительным числом. Попробуйте снова.");
                                            continue;
                                        }
                                        break; // Выход из цикла, если ввод корректен
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                                        scanner.next(); // Очистка некорректного ввода
                                    }
                                }
                                while (true) {
                                    try {
                                        System.out.print("Введите высоту прямоугольника: ");
                                        height = scanner.nextDouble();
                                        if (height <= 0) {
                                            System.out.println("Высота должна быть положительным числом. Попробуйте снова.");
                                            continue;
                                        }
                                        break; // Выход из цикла, если ввод корректен
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                                        scanner.next(); // Очистка некорректного ввода
                                    }
                                }
                                double rectangleArea = width * height;
                                shape = new Task4("Прямоугольник", rectangleArea);
                                break;

                            case 4:
                                double a = 0, b = 0, c = 0;
                                while (true) {
                                    try {
                                        System.out.print("Введите сторону a треугольника: ");
                                        a = scanner.nextDouble();
                                        if (a <= 0) {
                                            System.out.println("Сторона должна быть положительным числом. Попробуйте снова.");
                                            continue;
                                        }
                                        break; // Выход из цикла, если ввод корректен
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                                        scanner.next(); // Очистка некорректного ввода
                                    }
                                }
                                while (true) {
                                    try {
                                        System.out.print("Введите сторону b треугольника: ");
                                        b = scanner.nextDouble();
                                        if (b <= 0) {
                                            System.out.println("Сторона должна быть положительным числом. Попробуйте снова.");
                                            continue;
                                        }
                                        break; // Выход из цикла, если ввод корректен
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                                        scanner.next(); // Очистка некорректного ввода
                                    }
                                }
                                while (true) {
                                    try {
                                        System.out.print("Введите сторону c треугольника: ");
                                        c = scanner.nextDouble();
                                        if (c <= 0) {
                                            System.out.println("Сторона должна быть положительным числом. Попробуйте снова.");
                                            continue;
                                        }
                                        break; // Выход из цикла, если ввод корректен
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                                        scanner.next(); // Очистка некорректного ввода
                                    }
                                }
                                double s = (a + b + c) / 2;
                                double triangleArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                                shape = new Task4("Треугольник", triangleArea);
                                break;

                            default:
                                System.out.println("Неверный выбор. Попробуйте снова.");
                                continue;
                        }

                        // Вывод информации о фигуре
                        System.out.println(shape.toString());
                    }
                    break;

                case 5:
                    //5.3
                    List<Object> shapes = new ArrayList<>().reversed();

                    while (true) {
                        System.out.println("Выберите действие:");
                        System.out.println("1.  Добавить фигуру (Круг)");
                        System.out.println("2.  Добавить фигуру (Квадрат)");
                        System.out.println("3.  Добавить фигуру (Прямоугольник)");
                        System.out.println("4.  Добавить фигуру (Треугольник)");
                        System.out.println("5.  Показать все фигуры и их площади");
                        System.out.println("6.  Показать общую площадь всех фигур");
                        System.out.println("0.  Выход из задания 5");

                        int choice = 0;

                        // Проверка на корректный ввод
                        while (true) {
                            try {
                                choice = scanner.nextInt();
                                if (choice < 0 || choice > 6) {
                                    System.out.println("Некорректный ввод. Пожалуйста, введите 1, 2, 3, 4, 5, 6 или 0.");
                                    continue;
                                }
                                break; // Ввод корректен
                            } catch (InputMismatchException e) {
                                System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                                scanner.next(); // Очистка некорректного ввода
                            }
                        }

                        if (choice == 0) {
                            break; // Выход из программы
                        }

                        switch (choice) {
                            case 1: // Круг
                                double centerX, centerY, radius;

                                // Ввод координат центра круга
                                while (true) {
                                    try {
                                        System.out.print("Введите координаты центра круга (x y): ");
                                        centerX = scanner.nextDouble();
                                        centerY = scanner.nextDouble();
                                        break; // Ввод корректен
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ошибка ввода! Пожалуйста, введите два числа.");
                                        scanner.next(); // Очистка некорректного ввода
                                    }
                                }

                                // Ввод радиуса круга
                                while (true) {
                                    try {
                                        System.out.print("Введите радиус круга: ");
                                        radius = scanner.nextDouble();
                                        if (radius <= 0) {
                                            System.out.println("Радиус должен быть положительным числом. Попробуйте снова.");
                                            continue;
                                        }
                                        break; // Ввод корректен
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                                        scanner.next(); // Очистка некорректного ввода
                                    }
                                }

                                shapes.add(new Circle(new Point1(centerX, centerY), radius));
                                System.out.println("Круг добавлен.");
                                break;

                            case 2: // Квадрат
                                double topLeftX, topLeftY, side;

                                // Ввод координат верхнего левого угла квадрата
                                while (true) {
                                    try {
                                        System.out.print("Введите координаты верхнего левого угла квадрата (x y): ");
                                        topLeftX = scanner.nextDouble();
                                        topLeftY = scanner.nextDouble();
                                        break; // Ввод корректен
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ошибка ввода! Пожалуйста, введите два числа.");
                                        scanner.next(); // Очистка некорректного ввода
                                    }
                                }

                                // Ввод длины стороны квадрата
                                while (true) {
                                    try {
                                        System.out.print("Введите длину стороны квадрата: ");
                                        side = scanner.nextDouble();
                                        if (side <= 0) {
                                            System.out.println("Сторона должна быть положительным числом. Попробуйте снова.");
                                            continue;
                                        }
                                        break; // Ввод корректен
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                                        scanner.next(); // Очистка некорректного ввода
                                    }
                                }

                                shapes.add(new Square(new Point1(topLeftX, topLeftY), side));
                                System.out.println("Квадрат добавлен.");
                                break;

                            case 3: // Прямоугольник
                                double rectTopLeftX, rectTopLeftY, width, height;

                                // Ввод координат верхнего левого угла прямоугольника
                                while (true) {
                                    try {
                                        System.out.print("Введите координаты верхнего левого угла прямоугольника (x y): ");
                                        rectTopLeftX = scanner.nextDouble();
                                        rectTopLeftY = scanner.nextDouble();
                                        break; // Ввод корректен
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ошибка ввода! Пожалуйста, введите два числа.");
                                        scanner.next(); // Очистка некорректного ввода
                                    }
                                }

                                // Ввод ширины и высоты прямоугольника
                                while (true) {
                                    try {
                                        System.out.print("Введите ширину и высоту прямоугольника: ");
                                        width = scanner.nextDouble();
                                        height = scanner.nextDouble();
                                        if (width <= 0 || height <= 0) {
                                            System.out.println("Ширина и высота должны быть положительными числами. Попробуйте снова.");
                                            continue;
                                        }
                                        break; // Ввод корректен
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ошибка ввода! Пожалуйста, введите два числа.");
                                        scanner.next(); // Очистка некорректного ввода
                                    }
                                }

                                shapes.add(new Rectangle());
                                System.out.println("Прямоугольник добавлен.");
                                break;

                            case 4: // Треугольник
                                double a, b, c;

                                // Ввод сторон треугольника
                                while (true) {
                                    try {
                                        System.out.print("Введите длины сторон треугольника (a b c): ");
                                        a = scanner.nextDouble();
                                        b = scanner.nextDouble();
                                        c = scanner.nextDouble();
                                        if (a <= 0 || b <= 0 || c <= 0) {
                                            System.out.println("Стороны треугольника должны быть положительными числами. Попробуйте снова.");
                                            continue;
                                        }
                                        // Проверка на существование треугольника
                                        if (a + b <= c || a + c <= b || b + c <= a) {
                                            System.out.println("Такой треугольник не может существовать. Попробуйте снова.");
                                            continue;
                                        }
                                        break; // Ввод корректен
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ошибка ввода! Пожалуйста, введите три числа.");
                                        scanner.next(); // Очистка некорректного ввода
                                    }
                                }

                                shapes.add(new Triangle(a, b, c));
                                System.out.println("Треугольник добавлен.");
                                break;

                            case 5: // Показать все фигуры и их площади
                                System.out.println("Список фигур:");
                                for (Object shape : shapes) {
                                    System.out.println(shape);
                                }
                                break;

                            case 6: // Показать общую площадь всех фигур
                                double totalArea = 0;
                                for (Object shape : shapes) {
                                    totalArea += shape.area();
                                }
                                System.out.println("Общая площадь всех фигур: " + totalArea);
                                break;
                        }
                    }
                    break;

                case 6:
                    // Задание 5.6
                    //Работа с замкнутой ломаной
                    Task6 closedPolygon = new Task6();
                    System.out.println("Введите координаты точек для замкнутой ломаной.");
                    while (true) {
                        System.out.println("Введите координаты точки (x y) или введите '0' для завершения:");
                        String input = scanner.nextLine();
                        if (input.equals("0")) {
                            break; // Завершение ввода
                        }

                        String[] coords = input.split(" ");
                        if (coords.length != 2) {
                            System.out.println("Ошибка ввода! Пожалуйста, введите два числа.");
                            continue;
                        }

                        try {
                            double xCoord = Double.parseDouble(coords[0]); // Изменено здесь
                            double yCoord = Double.parseDouble(coords[1]); // Изменено здесь
                            closedPolygon.addPoint(xCoord, yCoord); // Изменено здесь
                        } catch (NumberFormatException e) {
                            System.out.println("Ошибка ввода! Пожалуйста, введите корректные числа.");
                        }
                    }

                    // Вывод информации о замкнутой ломаной
                    System.out.println(closedPolygon.toString());
                    System.out.println("Длина замкнутой ломаной: " + closedPolygon.getLength());
                    break;

                case 7:
                    // 6.4
                    //Работа с точками
                    List<Point1> points = new ArrayList<>();

                    while (true) {
                        System.out.println("Выберите действие:");
                        System.out.println("1. Добавить точку");
                        System.out.println("2. Сравнить две точки");
                        System.out.println("0. Выйти из задания 7");
                        int action = scanner.nextInt();

                        if (action == 0) {
                            System.out.println("Выход из задания 7.");
                            break;
                        }

                        switch (action) {
                            case 1:
                                // Ввод координат точки
                                System.out.print("Введите координату X: ");
                                double coordX = scanner.nextDouble();
                                System.out.print("Введите координату Y: ");
                                double coordY = scanner.nextDouble();
                                points.add(new Point1(coordX, coordY));
                                System.out.println("Точка добавлена: " + points.get(points.size() - 1));
                                break;

                            case 2:
                                // Сравнение двух точек
                                if (points.size() < 2) {
                                    System.out.println("Сначала добавьте хотя бы две точки.");
                                    break;
                                }
                                System.out.println("Выберите две точки для сравнения (1-" + points.size() + "):");
                                for (int i = 0; i < points.size(); i++) {
                                    System.out.println((i + 1) + ": " + points.get(i));
                                }
                                System.out.print("Введите номер первой точки: ");
                                int firstIndex = scanner.nextInt() - 1;
                                System.out.print("Введите номер второй точки: ");
                                int secondIndex = scanner.nextInt() - 1;

                                if (firstIndex >= 0 && firstIndex < points.size() && secondIndex >= 0 && secondIndex < points.size()) {
                                    boolean areEqual = points.get(firstIndex).equals(points.get(secondIndex));
                                    System.out.println("Точки " + points.get(firstIndex) + " и " + points.get(secondIndex) + " равны: " + areEqual);
                                } else {
                                    System.out.println("Неверные номера точек.");
                                }
                                break;

                            default:
                                System.out.println("Неверный выбор действия.");
                                break;
                        }
                    }
                    break;

                case 8:
                    // Здесь можно добавить логику для задания 8
                    break;

                case 9:
                    // Здесь можно добавить логику для задания 9
                    break;

                case 10:
                    // Здесь можно добавить логику для задания 10
                    break;

                case 11:
                    // Здесь можно добавить логику для задания 11
                    break;

                default:
                    System.out.println("Неверный номер задания. Пожалуйста, выберите номер от 1 до 11.");
                    break;
            }
        }

        scanner.close();
    }
}
