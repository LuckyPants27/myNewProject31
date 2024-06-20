package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.exception.DivideByZeroException;

@Service
public class CalculatorService {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new DivideByZeroException();
        }
        return a / b;
    }

}
