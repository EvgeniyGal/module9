package com.list;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> {

    private Object[] dataStorage;


    public MyArrayList() {

        this.dataStorage = new Object[0];
    }

    public MyArrayList(E value) {

        this.dataStorage = new Object[]{value};
    }

    public MyArrayList(E[] values) {

        this.dataStorage = values;
    }

    public void add(E value) {
        Object[] temp = new Object[dataStorage.length + 1];
        System.arraycopy(dataStorage, 0, temp, 0, dataStorage.length);
        dataStorage = temp;
        dataStorage[dataStorage.length - 1] = value;
    }

    public void remove(int index) {
        Object[] temp = new Object[dataStorage.length - 1];

        if (index == dataStorage.length - 1)
            System.arraycopy(dataStorage, 0, temp, 0, dataStorage.length - 1);
        else if (index == 0) {
            System.arraycopy(dataStorage, 1, temp, 0, dataStorage.length - 1);
        } else {
            System.arraycopy(dataStorage, 0, temp, 0, index);
            System.arraycopy(dataStorage, index +1, temp, index, dataStorage.length - index -1);
        }
        dataStorage = temp;
    }


    public void clear() {
        dataStorage = new Object[0];
    }

    public int size() {
        return dataStorage.length;
    }

    public E add(int index) {
        return (E) dataStorage[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(dataStorage);
    }

    public E get(int index) {
        return (E) dataStorage[index];
    }
}
