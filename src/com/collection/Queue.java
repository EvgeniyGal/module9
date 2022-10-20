package com.collection;

public interface Queue<E> {

    void add(E item);

    void remove(int index);

    void clear();

    int size();

    E peek();

    E poll();

}
