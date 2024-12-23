//лаба 6

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
                    // Задание 1

    
                    break;

                case 2:
                    // Задание 2

                    break;

                case 3:

                    break;

                case 4:
                   
                    break;

                case 5:
             

                    break;

                case 6:

                    
                    break;

                case 7:
                  
                    break;

                case 8:
                   
                    break;

                case 9:
                   
                    break;    

                default:
                    System.out.println("Неверный номер задания. Пожалуйста, выберите номер от 1 до 9.");
                    break;
            }
        }

        scanner.close();
    }
}

