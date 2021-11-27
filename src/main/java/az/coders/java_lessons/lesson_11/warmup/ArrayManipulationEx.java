package az.coders.java_lessons.lesson_11.warmup;

import java.util.Arrays;
import java.util.Random;

public class ArrayManipulationEx {

    public static void main(String[] args) {
        int[] rndArray = generateRandomArray(150, 10_000_000);
        int[] countedArray = findNumberCountFromRandomArray(150, rndArray);

        for (int i = 0; i < countedArray.length; i++) {
            System.out.printf("%d = %d\n", i, countedArray[i]);
        }
    }

    private static int[] findNumberCountFromRandomArray(int size, int[] rndArray) {
        int[] outputArr = new int[size];

        for (int j : rndArray)
            outputArr[j]++;

        return outputArr;
    }

    private static int[] generateRandomArray(int bound, int size) {
        int[] arr = new int[size];
        Random rnd = new Random();

        for (int i = 0; i < size; i++)
            arr[i] = rnd.nextInt(bound);

        return arr;
    }
}
