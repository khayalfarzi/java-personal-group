package az.coders.java_lessons.lesson_10.warmup;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringArrayManipulation {

    public static String[] findDuplicateElements(String[] arr) {
        String[] response = new String[arr.length / 2 + 1];

        int iteration = 0;
        for (String word : arr) {

            if (isDuplicate(word, arr) && !isContains(word, response)) {
                response[iteration] = word;
                iteration++;
            }
        }


        return trimNulls(response);
    }

    private static String[] trimNulls(String[] arr) {
        int count = 0;
        int iteration = 0;

        for (String s : arr) {
            if (s != null)
                count++;
        }

        String[] trimmedArr = new String[count];

        for (String s : arr) {
            if (s != null) {
                trimmedArr[iteration] = s;
                iteration++;
            }
        }
        return trimmedArr;
    }

    private static boolean isContains(String word, String[] arr) {
        for (String value : arr) {
            if (word.equals(value))
                return true;
        }
        return false;
    }

    private static boolean isDuplicate(String word, String[] arr) {
        int count = 0;

        for (String value : arr) {
            if (word.equals(value))
                count++;
        }

        return count >= 2;
    }
}
