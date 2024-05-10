package com.calculator.goryachev.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping(path = "/calculator")
    public String answerWelcome() {
        return "Добро пожаловать в калькулятор.";
    }
}
