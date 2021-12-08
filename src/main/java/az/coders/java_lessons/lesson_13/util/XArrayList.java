package az.coders.java_lessons.lesson_13.util;

import java.util.Arrays;

public class XArrayList<T> implements XList<T> {

    private static final int capacity = 10;
    private Object[] elementData;
    private int size = 0;

    public XArrayList() {
        elementData = new Object[capacity];
    }

    public XArrayList(int capacity) {
        elementData = new Object[capacity];
    }

    @Override
    public void add(T element) {
        ensureCapacity(size + 1, elementData);
        elementData[size++] = element;
    }

    @Override
    public T add(int index, T element) {
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
        return null;
    }

    @Override
    public void remove(int index) {
        System.arraycopy(elementData, 0, elementData, 0, index);
        System.arraycopy(elementData, index + 1, elementData, index, elementData.length - index - 1);
    }

    @Override
    public T get(int index) {
        for (int i = 0; i < size(); i++) {
            if(i == index){
                return (T) elementData[i];
            }
        }
        return null;
    }

    @Override
    public T get(T element) {
        return null;
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i] != null){
                count = i;
            }
        }
        return count;
    }

    @Override
    public void set(int index, T element) {
        elementData[index] = element;
    }

    @Override
    public void sort() {
        Arrays.sort(elementData);
    }

    private void ensureCapacity(int size, Object[] elementData) {
        if (size >= elementData.length)
            this.elementData = new Object[size * 2];
        System.arraycopy(elementData, 0, elementData, 0, elementData.length);
    }
}
