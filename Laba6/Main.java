import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.Scanner;

public class Main {
    static Main m = new Main();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите номер задания (1-9) или введите 0 для выхода:");
            int taskNumber = scanner.nextInt();

            if (taskNumber == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            switch (taskNumber) {
                case 1:
                    // Задание 1.2
                    try {
                        // Создаем объект Human с некорректным возрастом (750 лет)
                        Human h = new Human(750);
                        System.out.println(h); // Выводим объект, например: Human{age=750}

                        // Выполняем валидацию объекта с использованием класса тестов HumanTests
                        Validator.validate(h, HumanTests.class);
                    } catch (Validator.ValidationException e) {
                        // Печатаем сообщение об ошибке, если валидация не прошла
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;

                case 2:
                    // Задание 2.1

                    break;

                case 3:
                    // Задание 2.2

                    break;

                case 4:
                    // Задание 2.3

                    break;

                case 5:
                    // Задание 2.4

                    break;

                case 6:
                    // Задание 2.5

                    break;

                case 7:
                    // Задание 2.6

                    break;

                case 8:
                    // Задание 3.2
                    try {
                        // Создаем несколько объектов
                        HumanV human1 = new HumanV(750);
                        System.out.println(human1);
                        HumanV human2 = new HumanV(25);
                        System.out.println(human2);

                        Person person1 = new Person(150);
                        System.out.println(person1);
                        Person person2 = new Person(0);
                        System.out.println(person2);

                        // Выполняем валидацию объектов
                        ValidatorV.validate(human1, human2, person1, person2);
                    } catch (ValidatorV.ValidationExceptionV e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 9:
                    // Задание 4
                    runTests();
                    
                    break;

                default:
                    System.out.println("Неверный номер задания. Пожалуйста, выберите номер от 1 до 9.");
                    break;
            }
        }

        scanner.close();
    }
    private static void runTests() {
        Result result = JUnitCore.runClasses(ValidationTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Тесты завершены. Всего тестов: " + result.getRunCount() + ", проваленных: " + result.getFailureCount());
    }
}


