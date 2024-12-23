// задание 2

public class Cat implements Meowable {
    private String name; // Имя кота
//    private int meowCount; // Счетчик мяуканий

    // Конструктор
    public Cat(String name) {
        this.name = name;
//        this.meowCount = 0;
    }

    @Override
    public void meow() {
        System.out.println(name + ": мяу!");
//        meowCount++;
    }

    // Метод для получения текстовой формы кота
    @Override
    public String toString() {
        return "кот: " + name;
    }

//    public int getMeowCount() {
//        return meowCount;
//    }
}
