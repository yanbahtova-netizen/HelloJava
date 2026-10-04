package javaCore5;

import java.util.Arrays;

public class DynamicArray<T> {
    private T[] array;
    private int size;

    public DynamicArray() {
        array = (T[]) new Object[10];
        size = 0;
    }

    void add(T el) {
        if(size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = el;
        size++;
    }

    void remove(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size --;
    }

    T get(int index) throws ArrayIndexOutOfBoundsException {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }
}
