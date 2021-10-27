package az.coders.java_lessons.lesson_3;

import java.util.Random;

public class MathExample {

    public static void main(String[] args) {

        System.out.println(Math.max(2, 3));
        System.out.println(Math.abs(-67));

        double rnd = Math.random();
        System.out.println(rnd);

        Random random = new Random();

        System.out.println(random.nextInt(20));

        // How we can implement minimum bound using Random or Math.random() classes
    }
}