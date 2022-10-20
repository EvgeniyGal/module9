package com.collection;

public interface List<E> {

    void add(E item);

    void remove(int index);

    void clear();

    int size();

    E get(int index);
}
