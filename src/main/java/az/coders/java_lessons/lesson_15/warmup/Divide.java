package az.coders.java_lessons.lesson_15.warmup;

public class Divide implements Calculation {

    @Override
    public int calc(int first, int second) {
        int result = 0;
        try {
            result = first / second;
        } catch (ArithmeticException ex) {
            System.out.println("An error occurred while dividing numbers... " + ex);
        } finally {
            System.out.println("Calculation process ended.");
        }
        return result;
    }
}
