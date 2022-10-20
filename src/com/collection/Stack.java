package com.collection;

public interface Stack<E> {

    void add(E item);

    void remove(int index);

    void clear();

    int size();

    E peek();

    E pop();

}
