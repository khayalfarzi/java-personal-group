package az.coders.java_lessons.lesson_13.util;

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
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public T get(int index) {
        return (T) elementData[index];
    }

    @Override
    public T get(T element) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void set(int index, T element) {

    }

    @Override
    public void sort() {

    }

    private void ensureCapacity(int size, Object[] elementData) {
        if (size >= elementData.length)
            this.elementData = new Object[size * 2];
        System.arraycopy(elementData, 0, elementData, 0, elementData.length);
    }
}
