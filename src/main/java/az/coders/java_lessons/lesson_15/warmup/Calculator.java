package az.coders.java_lessons.lesson_15.warmup;

import java.util.Scanner;

public class Calculator {

    public Calculation calculate(String op) {
        if (op.equalsIgnoreCase("div"))
            return new Divide();

        else if (op.equalsIgnoreCase("multi"))
            return new Multiplication();

        else if (op.equalsIgnoreCase("sub"))
            return new Subtraction();

        else if (op.equalsIgnoreCase("add"))
            return new Addition();

        else throw new RuntimeException("Operation is not founded");
    }

    public int getNumber(Scanner sc) {
        int number = 0;

        try {
            number = sc.nextInt();
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        return number;
    }

    public String getString(Scanner sc) {
        String str = "";
        try {
            str = sc.next();
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        return str;
    }
}
