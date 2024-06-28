package cn.tommypoon.aop.jdkproxy;

import org.junit.Test;

public class MyCalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new MyCalculator();
        System.out.println(calculator.add(9, 3));
    }

    @Test
    public void subtract() {
        Calculator calculator = new MyCalculator();
        System.out.println(calculator.subtract(3, 2));
    }

    @Test
    public void multiply() {
        Calculator calculator = new MyCalculator();
        System.out.println(calculator.multiply(9, 3));
    }

    @Test
    public void divide() {
        Calculator calculator = new MyCalculator();
        System.out.println(calculator.divide(9, 3));
    }
}