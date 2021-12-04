package az.coders.java_lessons.lesson_13.util;

public class Main {

    public static void main(String[] args) {

        XList<Integer> xArrayList = new XArrayList<>();
        xArrayList.add(5);
        xArrayList.add(12);

        System.out.println(xArrayList.get(1));
    }
}
