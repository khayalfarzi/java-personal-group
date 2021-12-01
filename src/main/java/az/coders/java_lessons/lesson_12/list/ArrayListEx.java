package az.coders.java_lessons.lesson_12.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

    public static void main(String[] args) {

        List<Integer> arrList = new ArrayList<>();

        arrList.add(2);
        arrList.add(4);
        arrList.add(5);
        arrList.add(9);

        System.out.println(arrList);
        /*
         *  -> -> -> -> Hedef
         *  [0-100]
         * 0, 1, 2, 3, 4, 5, 6 ..., 100 -> {List}
         *
         * [0, 100]
         *
         * -> -> -> -> Hedef
         * -> -> -> -> Hedef
         * -> -> -> -> Hedef
         * -> -> -> -> Hedef
         * -> -> -> -> Hedef
         *
         * [0-20]
         * 0, 1, ... 20 -> {list]
         * [20-40]
         * 20, 21, ... 40 -> {list]
         * [40-60]
         * 40, 41, ... 60 -> {list]
         * */
    }
}
