package az.coders.java_lessons.lesson_6.warmup;

public class RecursionExample {

    public static int factorial(int num) {
        return num > 1 ? num * factorial(num - 1) : 1;
    }
}
