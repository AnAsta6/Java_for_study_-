package ru.example.lab.geometry;

/**
 * Калькулятор степеней (ранее Task10)
 */
public final class Task10 {
    public static double calculate(String xStr, String yStr) {
        try {
            double x = Double.parseDouble(xStr);
            double y = Double.parseDouble(yStr);
            return Math.pow(x, y);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Некорректные входные данные", e);
        }
    }
}
