//лаба 5

import java.util.Scanner;


public class Main {
    static Main m = new Main();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите номер задания (1-8) или введите 0 для выхода:");
            int taskNumber = scanner.nextInt();

            if (taskNumber == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            switch (taskNumber) {
                case 1:
                    // Задание 1

                    try {

                        System.out.print("Введите числитель дроби: ");
                        int numerator = scanner.nextInt();
                        System.out.print("Введите знаменатель дроби: ");
                        int denominator = scanner.nextInt();

                        Fraction fraction = new Fraction(numerator, denominator);
                        System.out.println("Дробь: " + fraction);
                        System.out.println("Вещественное значение: " + fraction.getValue());

                        // Изменение числителя и знаменателя
                        System.out.print("Введите новый числитель: ");
                        fraction.setNumerator(scanner.nextInt());
                        System.out.print("Введите новый знаменатель: ");
                        fraction.setDenominator(scanner.nextInt());
                        System.out.println("Обновленная дробь: " + fraction);
                        System.out.println("Обновленное вещественное значение: " + fraction.getValue());

                        // сравнение дробей
                        Fraction anotherFraction = new Fraction(numerator, denominator);
                        System.out.println("Дроби равны: " + fraction.equals(anotherFraction));

                    }
                    // исключение
                    // для выхода из программы при вводе 0 в знаменатель
                    catch (IllegalArgumentException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }


                    break;

                case 2:
                    // Задание 2

                    System.out.print("Введите имя кота: ");
                    String catName = scanner.next();
                    Cat cat = new Cat(catName);



                    System.out.print("Введите количество мяуканий кота "+ catName +" : ");
                    int meowCount = scanner.nextInt();
                    Meowable[] meowables = new Meowable[meowCount];
                    for (int i = 0; i < meowCount; i++) {
                        meowables[i] = cat;
                    }


                    Funs.meowsCare(meowables); //вызов метода meowCount
                    System.out.println("Кот " + catName + " мяукал " + cat.getMeowCount() + " раз");


                    break;

                case 3:
                    // Задание 3.9

                    break;

                case 4:
                    // Задание 4.9

                    break;

                case 5:
                    // Задание 5.9

                    break;

                case 6:
                    // Задание 6.4

                    break;

                case 7:
                    // Задание 7.1

                    break;

                case 8:
                    // Задание 7.2

                    break;

                default:
                    System.out.println("Неверный номер задания. Пожалуйста, выберите номер от 1 до 8.");
                    break;
            }
        }

        scanner.close();
    }
}
