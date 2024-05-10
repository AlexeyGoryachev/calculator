package com.calculator.goryachev.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping(path = "/calculator")
    public String answerWelcome() {
        return "Добро пожаловать в калькулятор.";
    }

    @GetMapping(path = "/calculator/plus")
    public String plusNumbers(@RequestParam int num1, @RequestParam int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }
    @GetMapping(path = "/calculator/minus")
    public String minusNumbers(@RequestParam int num1, @RequestParam int num2) {
        int sum = num1 - num2;
        return num1 + " - " + num2 + " = " + sum;
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiplyNumbers(@RequestParam int num1, @RequestParam int num2) {
        int sum = num1 * num2;
        return num1 + " * " + num2 + " = " + sum;
    }
    @GetMapping(path = "/calculator/divide")
    public String divideNumbers(@RequestParam int num1, @RequestParam int num2) {
        int sum = num1 / num2;
        return num1 + " / " + num2 + " = " + sum;
    }
}
