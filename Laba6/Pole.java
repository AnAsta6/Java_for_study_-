//2.3

@ToString
public class Pole {
    @ToString(value = "NO")
    private String field;

    private int number;

    @Override
    public String toString() {
        return "Пример. Поле='" + field + "', Число=" + number + "}";
    }
}
