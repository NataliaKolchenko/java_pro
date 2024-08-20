package example;

import example.Exception.DivisionByZeroException;
import example.Exception.InvalidCtgException;
import example.Exception.InvalidLogarithmException;
import example.Exception.NegativeFactorialException;

import java.util.stream.IntStream;

public class Calculator {

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль невозможно");
        }
        return a / b;
    }

    public double naturalLog(double a) {
        if (a <= 0) {
            throw new InvalidLogarithmException("Логарифм возможен только для положительных чисел");
        }
        return Math.log(a);
    }

    //  логарифм числа a по основанию b
    public double log(double a, double base) {
        if (a <= 0 || base <= 0) {
            throw new InvalidLogarithmException("Логарифм возможен только для положительных чисел");
        }
        return Math.log(a) / Math.log(base);
    }

    public double tg(double angle) {
        return Math.tan(Math.toRadians(angle));
    }

    public double ctg(double angle) {
        if (angle == 0) {
            throw new InvalidCtgException("Угол не может равняться 0");
        }

        return 1.0 / Math.tan(Math.toRadians(angle));
    }

    public double sin(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public double cos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new NegativeFactorialException("Факториал не определен для отрицательных чисел");
        }
        return (n == 0) ? 1 : Math.multiplyExact(n, factorial(n - 1));
    }

}

