package az.coders.java_lessons.lesson_11.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

//        Iterable
//        Collection
//        List
//        ArrayList
//        List<String> list = new ArrayList<>();

        ArrayList list = new ArrayList();
        list.add("Salam");
        list.add(123);
        list.add(true);
        list.add(new Demo("Hey Collections we are here !"));
//        System.out.println(list);

        List<Integer> intList = new ArrayList<>(); // 20 b
        intList.add(23);
        intList.add(65);
        intList.add(44);

        System.out.println(intList.contains(65));
        System.out.println(intList.size());
        intList.addAll(asList(1, 2, 3));
        System.out.println(intList);

        Iterator<Integer> it = intList.iterator(); // 5 b

        while (it.hasNext())
            System.out.println(it.next());

    }
}
