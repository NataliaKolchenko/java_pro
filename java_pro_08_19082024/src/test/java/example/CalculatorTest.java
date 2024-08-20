package example;

import example.Exception.DivisionByZeroException;
import example.Exception.InvalidCtgException;
import example.Exception.InvalidLogarithmException;
import example.Exception.NegativeFactorialException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();


    @Test
    void sumPositiveNumbersTest() {
        assertEquals(4, calculator.sum(2, 2));
    }

    @Test
    void sumNegativeNumbersTest() {
        assertEquals(-4, calculator.sum(-2, -2));
    }

    @Test
    void sumPositiveNegativeNumbersTest() {
        assertEquals(0, calculator.sum(2, -2));
    }

    @Test
    void subtractPositiveNumbersTest() {
        assertEquals(0, calculator.subtract(2, 2));
    }

    @Test
    void subtractNegativeNumbersTest() {
        assertEquals(0, calculator.subtract(-2, -2));
    }

    @Test
    void subtractNegativeAndPositiveNumbersTest() {
        assertEquals(4, calculator.subtract(2, -2));
    }

    @Test
    void multiplyPositiveNumbersTest() {
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    void multiplyNegativeNumbersTest() {
        assertEquals(4, calculator.multiply(-2, -2));
    }

    @Test
    void multiplyNegativePositiveNumbersTest() {
        assertEquals(-4, calculator.multiply(2, -2));
    }

    @Test
    void multiplyByZeroTest() {
        assertEquals(0, calculator.multiply(2, 0));
    }

    @Test
    void divideNumbersTest() {
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    void divideOnZeroTest() {
        assertEquals(0, calculator.divide(0, 4));
    }

    @Test
    void divideByZeroTest() {
        assertThrows(DivisionByZeroException.class, () -> calculator.divide(2, 0));
    }

    @Test
    void naturalLogAnyNumberTest() {
        assertEquals(6.907755278982137, calculator.naturalLog(1000));
    }

    @Test
    void naturalLogByOneTest() {
        assertEquals(0, calculator.naturalLog(1));
    }

    @Test
    void naturalLogByZeroTest() {
        assertThrows(InvalidLogarithmException.class, () -> calculator.naturalLog(0));
    }

    @Test
    void naturalLogNegativeNumberTest() {
        assertThrows(InvalidLogarithmException.class, () -> calculator.naturalLog(-1));
    }

    @Test
    void logPositiveNumberTest() {
        assertEquals(3.0, calculator.log(8, 2));
    }

    @Test
    void logNegativeATest() {
        assertThrows(InvalidLogarithmException.class, () -> calculator.log(-8, 2));
    }

    @Test
    void logNegativeBaseTest() {
        assertThrows(InvalidLogarithmException.class, () -> calculator.log(8, -2));
    }

    @Test
    void logByZeroATest() {
        assertThrows(InvalidLogarithmException.class, () -> calculator.log(0, 2));
    }

    @Test
    void logByZeroBaseTest() {
        assertThrows(InvalidLogarithmException.class, () -> calculator.log(9, 0));
    }

    @Test
    void tgPositiveNumberTest() {
        assertEquals(0.5773502691896257, calculator.tg(30));
    }

    @Test
    void tgNegativeNumberTest() {
        assertEquals(-0.5773502691896257, calculator.tg(-30));
    }

    @Test
    void tgByZeroTest() {
        assertEquals(0, calculator.tg(0));
    }

    @Test
    void ctgPositiveNumberTest() {
        assertEquals(1.7320508075688774, calculator.ctg(30));
    }

    @Test
    void ctgNegativeNumberTest() {
        assertEquals(-1.7320508075688774, calculator.ctg(-30));
    }

    @Test
    void ctgByZeroTest() {
        assertThrows(InvalidCtgException.class, () -> calculator.ctg(0));
    }

    @Test
    void sinPositiveNumberTest() {
        assertEquals(0.49999999999999994, calculator.sin(30));
    }

    @Test
    void sinNegativeNumberTest() {
        assertEquals(-0.49999999999999994, calculator.sin(-30));
    }

    @Test
    void sinByZeroTest() {
        assertEquals(0, calculator.sin(0));
    }

    @Test
    void cosPositiveNumberTest() {
        assertEquals(0.8660254037844387, calculator.cos(30));
    }

    @Test
    void cosNegativeNumberTest() {
        assertEquals(0.8660254037844387, calculator.cos(-30));
    }

    @Test
    void cosByZeroTest() {
        assertEquals(1, calculator.cos(0));
    }

    @Test
    void factorialPositiveNumberTest() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void factorialNegativeNumberTest() {
        assertThrows(NegativeFactorialException.class, () -> calculator.factorial(-5));
    }

    @Test
    void factorialByZeroTest() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void factorialByOneTest() {
        assertEquals(1, calculator.factorial(1));
    }
}