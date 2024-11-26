//лаба 3

import java.util.Scanner;


public class Main {
    static Main m = new Main();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите номер задания (1-7) или введите 0 для выхода:");
            int taskNumber = scanner.nextInt();

            if (taskNumber == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            switch (taskNumber) {
                case 1:
                    // Задание 1.3
                    Task1.main(args);   // Вызов статического метода main из Task1
                    break;

                case 2:
                    // Задание 1.4
                    Task2.main(args);
                    break;

                case 3:
                    // Задание 2.3
                    Task3.main(args);
                    break;

                case 4:
                    // Задание 3.1
                    Task4.main(args);
                    break;

                case 5:
                    // Задание 3.2
                    Task5.main(args);
                    break;

                case 6:
                    // Задание 3.3
                    Task6.main(args);
                    break;

                case 7:
                    // Задание 3.4
                    Task7.main(args);
                    break;

                default:
                    System.out.println("Неверный номер задания. Пожалуйста, выберите номер от 1 до 11.");
                    break;
            }
        }

        scanner.close();
    }
}