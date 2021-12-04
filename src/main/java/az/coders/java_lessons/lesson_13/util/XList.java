package az.coders.java_lessons.lesson_13.util;

public interface XList<T> {

    void add(T element);

    T add(int index, T element);

    void remove(int index);

    T get(int index);

    T get(T element);

    int size();

    void set(int index, T element);

    void sort();
}