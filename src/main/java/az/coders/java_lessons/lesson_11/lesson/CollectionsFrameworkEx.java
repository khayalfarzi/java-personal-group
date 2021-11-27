package az.coders.java_lessons.lesson_11.lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CollectionsFrameworkEx {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Fill the bound: ");
        int bound = sc.nextInt();
        System.out.print("Fill the size : ");
        int size = sc.nextInt();

        List<Integer> rndList = fillRndNumbers(bound, size);
        System.out.printf("Actual list: %s\n", rndList);

        Collections.sort(rndList);
        System.out.printf("Sorted list: %s\n", rndList);
    }

    private static List<Integer> fillRndNumbers(int bound, int size) {
        Random rnd = new Random();
        List<Integer> rndNumbers = new ArrayList<>();

        for (int i = 0; i < size; i++)
            rndNumbers.add(rnd.nextInt(bound));

        return rndNumbers;
    }
}
