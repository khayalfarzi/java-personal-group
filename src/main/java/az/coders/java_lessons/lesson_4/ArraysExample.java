package az.coders.java_lessons.lesson_4;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {

        int[] arrInts = {1, 7, 2, 8, 9, 13, 16, 21};
        System.out.println("Static array: " + Arrays.toString(arrInts));
        int[] arrInts2 = new int[5];
        arrInts2[0] = 5;
        arrInts2[1] = 6;
//        arrInts2[2] = 8;
//        arrInts2[3] = 95;
        arrInts2[4] = 5;

        System.out.println("Dynamic array: " + Arrays.toString(arrInts2));
        // [ 5 6 0 0 5 ]

    }
}
