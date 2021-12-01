package az.coders.java_lessons.lesson_12.set;

import java.util.Set;

public class HashSet {

    public static void main(String[] args) {

        Set<Integer> ints = new java.util.HashSet<>();
        ints.add(1);
        ints.add(1);
        ints.add(2);

        System.out.println(ints);
    }
}
