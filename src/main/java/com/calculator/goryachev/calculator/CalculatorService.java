package com.calculator.goryachev.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int plusNumbers(int num1, int num2) {
        return num1 + num2;
    }
    public int minusNumbers(int num1, int num2) {
        return num1 - num2;
    }
    public int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }
    public int divideNumbers(int num1, int num2) {
        return num1 / num2;
    }
}
