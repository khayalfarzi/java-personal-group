package az.coders.java_lessons.lesson_11.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class CollectionEx {
    public static void main(String[] args) {
        // Array way
        int[] arr = {1, 2, 3, 4};
        int[] newArr = new int[arr.length - 1];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != 2) {
                newArr[cnt] = arr[i];
                cnt++;
            }
        }

        System.out.println(Arrays.toString(newArr));

        // Collection way
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(2);
        System.out.println(list);
    }
}
