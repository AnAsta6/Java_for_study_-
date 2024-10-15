import java.util.Scanner;
import java.math.BigDecimal;


public class Laba1 {
    static Laba1 l = new Laba1();

    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //меню

        System.out.println("Добро пожаловать в Лабораторную работу №1.");
        System.out.println("Введите номер задачи (1-20), чтобы запустить ее:");

        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            case 4:
                task4();
                break;
            case 5:
                task5();
                break;
            case 6:
                task6();
                break;
            case 7:
                task7();
                break;
            case 8:
                task8();
                break;
            case 9:
                task9();
                break;
            case 10:
                task10();
                break;
            case 11:
                task11();
                break;
            case 12:
                task12();
                break;
            case 13:
                task13();
                break;
            case 14:
                task14();
                break;
            case 15:
                task15();
                break;
            case 16:
                task16();
                break;
            case 17:
                task17();
                break;
            case 18:
                task18();
                break;
            case 19:
                task19();
                break;
            case 20:
                task20();
                break;

            default:
                System.out.println("Неправильный номер задачи. Пожалуйста, попробуйте еще раз.");
        }
    }

    //Надо определить каждую задачу как отдельный метод

    //задание 1.1
    public static void task1() {
        task1n1 calculator = new task1n1();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите десятичное число для возвращения дробной части" + "\n");
        System.out.print("Пример ввода: 5,25" + "\n");
        System.out.print("Пример ввода: 5.25" + "\n");
        System.out.print("Введите Ваше число: ");
        String input = scanner.next();
        double x = Double.parseDouble(input.replace(',', '.'));

        BigDecimal bd = new BigDecimal(String.valueOf(x));
        bd = bd.subtract(new BigDecimal(bd.intValue())); // вычитание из изначального числа бездробного

        System.out.println("Дробная часть Вашего числа: " + bd + "\n");
    }

    //задание 1.3
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Если вы введёте два символа рядом, то в ответе будет число 1"+"\n");
        System.out.print("Введите символ (цифру от 0 до 9): ");
        char x = scanner.next().charAt(0);
        int result = l.charToNum(x);
        System.out.println("Результат: " + result);
    }

    public int charToNum(char x) {
        return x - 48; // вычитание из Значение ASCII числа х значения нуля
    }

    // задание 1.5
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Программа выведет true если число двузначное. " + "\n");
        System.out.print("Введите число: ");
        int x = scanner.nextInt();
        boolean result = l.is2Digits(x);
        System.out.println("Результат: " + result);
    }

    public boolean is2Digits(int x) {
        return x >= 10 && x < 100; // ограничение для того, что бы были двухзначные числа
    }

    // задание 1.7
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Программа для проверки нахождения числа в диапазоне " +"\n");
        System.out.print("Сначала введите края диапазона(первое число может быть как больше, так и меньше второго числа" +"\n");
        System.out.print("После границ диапазона вводите число, которое хотите проверить на нахождение в данном диапазоне" +"\n");
        System.out.print("Введите первую границу диапазона: ");
        int a = scanner.nextInt();
        System.out.print("Введите вторую границу диапазона: ");
        int b = scanner.nextInt();
        System.out.print("Введите число для проверки: ");
        int num = scanner.nextInt();
        boolean result = l.isInRange(a, b, num);
        System.out.println("Результат: " + result);
    }

    public boolean isInRange(int a, int b, int num) {
        return (a <= num && num <= b) || (b <= num && num <= a); //проверка на нахождение числа в диапазоне который задал пользователь

    }

    // задание 1.9
    public static void task5() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Программа для проверки равенства всех трёх чисел " +"\n");
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        boolean result = l.isEqual(a, b, c);
        System.out.println("Результат: " + result);
    }

    public boolean isEqual(int a, int b, int c ) {
        return (a == c && c == b && a == b ) ; //проверка на нахождение числа в диапазоне который задал пользователь


    }

    // задание 2.1
    public static void task6() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Программа считает модуль числа"+"\n");
        System.out.print("Введите число: ");
        int x = scanner.nextInt();
        int result = l.abs(x);
        System.out.println("Модуль числа: " + result);
    }

    public int abs(int x) {// считает модуль
        if (x < 0) {
            return -x; // Если x отрицательное, возвращаем его противоположное значение
        } else {
            return x; // Если x положительное или равно нулю, возвращаем x
        }
    }
    // задание 2.3
    public static void task7() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Программа проверяет делимость числа на 3 и 5"+"\n");
        System.out.print("Сначала проверяет, делится ли число на 3 и 5 одновременно. Если да, возвращает false."+"\n");
        System.out.print("Потом, делится ли числр на 3 или 5. Если одно из условий истинно, возвращает true."+"\n");
        System.out.print(" Если ни одно из условий не выполняется - false"+"\n");
        System.out.print("Введите число для проверки: ");
        int x = scanner.nextInt();
        boolean result = l.is35(x);
        System.out.println("Результат: " + result);
    }

    public boolean is35(int x) {
        // Проверяем делимость на 3 и 5
        if (x % 3 == 0 && x % 5 == 0) {
            return false; // Если делится и на 3, и на 5, возвращает мfalse
        } else if (x % 3 == 0 || x % 5 == 0) {
            return true; // Если делится на 3 или 5, возвращает true
        } else {
            return false; // Если не делится ни на 3, ни на 5, возвращает false
        }
    }


    // задание 2.5
    public static void task8() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите три числа для поиска максимума среди них" + "\n");
        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int z = scanner.nextInt();
        int result = l.max3(x, y, z);
        System.out.println("Максимум: " + result);
    }

    public int max3(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }

    }

    // задание 2.7
    public static void task9() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа для определения их суммы" + "\n");
        System.out.print("Если сумма попадает в диапазон от 10 до 19,то ответом будет 20" + "\n");
        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        int result = l.sum2(x, y);
        System.out.println("Результат: " + result);
    }

    public int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }

    }

    // задание 2.9
    public static void task10() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день недели (1-7): ");
        int x = scanner.nextInt();
        String result = l.day(x);
        System.out.println("День недели: " + result);
    }

    public String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }

    }

    // задание 3.1
    public static void task11() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Программа возвращает строку, в которой будут записаны все числа от 0 до x (включительно)" + "\n");
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();
        String result = l.listNums(x);
        System.out.println("Числа подряд: " + result);
    }

    public String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i + " ";
        }
        return result.trim();
    }

    //задание 3.3
    public static void task12() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Программа возвращает строку, в которой будут записаны все четные числа от 0 до x (включительно)" + "\n");
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();
        String result = l.chet(x);
        System.out.println("Четные числа: " + result);
    }

    public String chet(int x) {
        String result = "";
        for (int i = 0; i <= x; i += 2) {
            result += i + " ";
        }
        return result.trim();

    }

    // задание 3.5
    public static void task13() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Программа считает количество знаков в числе x. " + "\n");
        System.out.print("Введите число x: ");
        long x = scanner.nextLong();
        int result = l.numLen(x);
        System.out.println("Длина числа: " + result);
    }

    public int numLen(long x) {
        int count = 0;
        while (x != 0) {
            x /= 10;
            count++;
        }
        return count;

    }

    // задание 3.7 квадрат
    public static void task14() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Програама печатает квадрат звездочек (*) размером x,1" + "\n");
        System.out.print("где x — количество строк и столбцов" + "\n");
        System.out.print("Введите размер квадрата x: ");
        int x = scanner.nextInt();
        l.square(x);
    }

    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // задание 3.9 правый треугольник
    public static void task15() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Данная программа выводит на экран треугольник из символов ‘*’ у которого х символов в высоту," + "\n");
        System.out.print("а количество символов в ряду совпадает с номером строки, при этом треугольник выровнен по правому краю." + "\n");
        System.out.print("Введите высоту треугольника x: ");
        int x = scanner.nextInt();
        l.rightTriangle(x);
    }

    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // задание 4.1 поиск в массиве
    public static void task16() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Програама возвращает индекс первого вхождения числа x в массив arr." + "\n");
        System.out.print("Если число не входит в массив возвращается -1." + "\n");
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Введите значение x: ");
        int x = scanner.nextInt();
        int result = l.findFirst(arr, x);
        System.out.println("Результат: " + result);
    }

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;

    }

    // задание 4.3 поиск максимального по модулю в массиве
    public static void task17() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Программа возвращает наибольшее по модулю" + "\n");
        System.out.print("(то есть без учета знака) значение массива arr." + "\n");
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = l.maxAbs(arr);
        System.out.println("Результат: " + result);
    }

    public int maxAbs(int[] arr) {
        int max = arr[0]; // Начинаем с первого элемента
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i]; // Обновляем max, если найдено большее по модулю
            }
        }
        return max; // Возвращаем элемент с максимальным модулем

    }

    // задание 4.5 Добавление массива в массив
    public static void task18() {

        System.out.print("Добавления массива в массив" +"\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите массив arr: ");
        int[] arr = l.readArray(scanner);
        System.out.print("Введите массив ins: ");
        int[] ins = l.readArray(scanner);
        System.out.print("Введите позицию pos: ");
        int pos = scanner.nextInt();
        int[] result = l.add(arr, ins, pos);
        System.out.println("Результат: " + l.arrayToString(result));
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, result, 0, pos);
        System.arraycopy(ins, 0, result, pos, ins.length);
        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
        return result;
    }

    public int[] readArray(Scanner scanner) {
        System.out.print("Введите количество элементов массива, а после ввода количества введите сами элементы через пробел: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public String arrayToString(int[] arr) {
        String result = "";
        for (int i : arr) {
            result += i + " ";
        }
        return result.trim();

    }

    // задание 4.7 разворот или референс массива
    public static void task19() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Разворот-референс массива" + "\n");
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] reversedArr = l.reverseBack(arr);
        System.out.print("Реверс массива: ");
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArr[i] + " ");
        }
    }

    public int[] reverseBack(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }
        return reversedArr;

    }

    // задание 4.9  Все вхождения
    public static void task20() {

        System.out.print("Программа возвращает новый массив, в котором записаны индексы всех вхождений числа x в массив arr.\n" + "\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();
        int[] indices = l.findAll(arr, x);
        System.out.print("Индексы вхождений числа x: ");
        for (int i = 0; i < indices.length; i++) {
            System.out.print(indices[i] + " ");
        }
    }

    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] indices = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices[j] = i;
                j++;
            }
        }
        return indices;

    }
}
