
import java.util.Objects;

public class FractionUtils {

    public static double getValue(int numerator, int denominator) {
        return (double) numerator / denominator;
    }

    public static boolean equals(Fraction fraction, Object obj) {
        if (fraction == obj) return true; // если ссылки одинаковы то объекты равны
        if (obj == null || fraction.getClass() != obj.getClass()) return false; // объект null или классы разные то объекты не равны
        Fraction other = (Fraction) obj; // приведение типа

        // Сравнение значений дробей
        return fraction.getValue() == other.getValue();
    }

    public static int hashCode(int numerator, int denominator) {
        return Objects.hash(numerator, denominator); // Генерация хеш-кода на основе полей
    }
}