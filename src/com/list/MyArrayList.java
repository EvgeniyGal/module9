package com.list;

import com.collection.List;
import java.util.Arrays;

public class MyArrayList<E> implements List<E> {

    private Object[] dataStorage;

    public MyArrayList() {

        this.dataStorage = new Object[0];
    }

    public MyArrayList(E value) {

        this.dataStorage = new Object[]{value};
    }

    @Override
    public void add(E item) {

        Object[] newDataStorage = new Object[dataStorage.length + 1];
        System.arraycopy(dataStorage, 0, newDataStorage, 0, dataStorage.length);
        dataStorage = newDataStorage;
        dataStorage[dataStorage.length - 1] = item;

    }

    @Override
    public void remove(int index) {

        Object[] newDataStorage = new Object[dataStorage.length - 1];

        if (index == dataStorage.length - 1){
            System.arraycopy(dataStorage, 0, newDataStorage, 0, dataStorage.length - 1);
        }
        else if (index == 0) {
            System.arraycopy(dataStorage, 1, newDataStorage, 0, dataStorage.length - 1);
        } else {
            System.arraycopy(dataStorage, 0, newDataStorage, 0, index);
            System.arraycopy(dataStorage, index +1, newDataStorage, index, dataStorage.length - index -1);
        }
        dataStorage = newDataStorage;

    }

    @Override
    public void clear() {
        dataStorage = new Object[0];
    }

    @Override
    public int size() {
        return dataStorage.length;
    }

    @Override
    public E get(int index) {
        return (E) dataStorage[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(dataStorage);
    }
}
