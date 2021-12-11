package az.coders.java_lessons.lesson_15.warmup;

import java.util.Scanner;

import static az.coders.java_lessons.lesson_15.warmup.Printer.print;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        print("Enter first number: ");
        int first = calculator.getNumber(sc);

        print("Enter second number: ");
        int second = calculator.getNumber(sc);

        print("Enter calc method (sub/div/multi/add): ");
        String calcMethod = calculator.getString(sc);

        Calculation calc = calculator.calculate(calcMethod);
        int result = calc.calc(first, second);
        print(result);
    }
}
