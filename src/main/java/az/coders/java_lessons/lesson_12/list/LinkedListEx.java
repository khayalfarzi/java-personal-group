package az.coders.java_lessons.lesson_12.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(90);
        linkedList.add(90);
        linkedList.add(89);

        System.out.println(linkedList);
        /*
         * ArrayList
         *  |3|
         *  |2|
         *  |1|
         * */
    }
}
