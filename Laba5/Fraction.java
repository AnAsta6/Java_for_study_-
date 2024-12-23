// задание 1

import java.util.Objects;

public class Fraction implements FractionInterface {

    private int numerator; // Числитель
    private int denominator; // Знаменатель

    // Конструктор
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            // исключение
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        if (denominator < 0) {
            // если знаменатель отрицательный => меняет знак числителя и знаменателя
            this.numerator = -numerator;
            this.denominator = -denominator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    @Override
    public double getValue() {
        return FractionUtils.getValue(this.numerator, this.denominator);
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            // тоже исключение
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        if (denominator < 0) {
            // знаменатель отрицательный => знак числителя и знаменателя меняется
            this.numerator = -this.numerator;
            this.denominator = -denominator;
        } else {
            this.denominator = denominator;
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        return FractionUtils.equals(this, obj);
    }

    @Override
    public int hashCode() {
        return FractionUtils.hashCode(this.numerator, this.denominator);
    }
}




//
//    private double cachedValue; // Кэшированное вещественное значение
//    private boolean valueCached; // Флаг кэширования
//

//    @Override
//    public double getValue() {
//        if (!valueCached) {
//            // значение не кэшировано => вычисляем и кэшируем
//            cachedValue = (double) numerator / denominator;
//            valueCached = true;
//        }
//        return cachedValue;
//    }

//    @Override
//    public void setNumerator(int numerator) {
//        this.numerator = numerator;
//        this.valueCached = false; // сбор кэша при изменении числителя
//    }

//    @Override
//    public void setDenominator(int denominator) {
//        if (denominator == 0) {
//            // тоже исключение
//            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
//        }
//        if (denominator < 0) {
//            // знаменатель отрицательный => знак числителя и знаменателя меняется
//            this.numerator = -this.numerator;
//            this.denominator = -denominator;
//        } else {
//            this.denominator = denominator;
//        }
//        this.valueCached = false; // сбор кэша при изменении знаменателя
//    }

//    @Override
//    public String toString() {
//        return numerator + "/" + denominator;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true; // если ссылки одинаковы то объекты равны
//        if (obj == null || getClass() != obj.getClass()) return false; // объект null или классы разные то объекты не равны
//        Fraction fraction = (Fraction) obj; // приведение типа
//
//        // Сравнение значений дробей
//        return this.getValue() == fraction.getValue();
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(numerator, denominator); // Генерация хеш-кода на основе полей
//    };
//}


