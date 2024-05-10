package com.calculator.goryachev.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String answerWelcome() {
        return "Добро пожаловать в калькулятор.";
    }

    @GetMapping(path = "/calculator/plus")
    public ResponseEntity<String> plusNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Для выполнения операции необходимо указать два числа.");
        }
        int sum = calculatorService.plusNumbers(num1, num2);
        return ResponseEntity.ok(num1 + " + " + num2 + " = " + sum);
    }

    @GetMapping(path = "/calculator/minus")
    public ResponseEntity<String> minusNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Для выполнения операции необходимо указать два числа.");
        }
        int sum = calculatorService.minusNumbers(num1, num2);
        return ResponseEntity.ok(num1 + " - " + num2 + " = " + sum);
    }

    @GetMapping(path = "/calculator/multiply")
    public ResponseEntity<String> multiplyNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Для выполнения операции необходимо указать два числа.");
        }
        int sum = calculatorService.multiplyNumbers(num1, num2);
        return ResponseEntity.ok(num1 + " * " + num2 + " = " + sum);
    }

    @GetMapping(path = "/calculator/divide")
    public ResponseEntity<String> divideNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Для выполнения операции необходимо указать два числа.");
        }
        int sum = calculatorService.divideNumbers(num1, num2);
        return ResponseEntity.ok(num1 + " / " + num2 + " = " + sum);
    }
}
