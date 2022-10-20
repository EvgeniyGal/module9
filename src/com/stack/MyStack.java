package com.stack;

import com.collection.Stack;
import com.list.MyLinkedList;

public class MyStack<E> implements Stack<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;


    public MyStack() {
        this(null);
        this.size = 0;
    }

    public MyStack(E value) {
        this.first = new Node<E>(value, null, null);
        this.size = 1;
    }

    @Override
    public void add(E value) {

        if (size == 0) {
            first = new Node<E>(value, null, null);
            size++;
            return;
        }
        if (size == 1) {
            first.next = new Node<E>(value, first, null);
            last = first.next;
            size++;
        } else {
            last.next = new Node<E>(value, last, null);
            last = last.next;
            size++;
        }

    }

    @Override
    public void remove(int index) {

        if (size == 1) {
            clear();
            return;
        }

        if (index == 0) {
            first = first.next;
            first.prev = null;
            size--;
            return;
        }
        if (index == size - 1) {
            last = last.prev;
            last.next = null;
            size--;
            return;
        }

        Node<E> tempNode = first;

        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        tempNode.prev.next = tempNode.next;
        tempNode.next.prev = tempNode.prev;
        size--;

    }

    @Override
    public void clear() {

        size = 0;
        first = last = null;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E peek() {
        return last.item;
    }

    @Override
    public E pop() {

        E item = last.item;
        remove(size-1);
        return item;

    }

    @Override
    public String toString() {

        if (size == 0 ) { return ""; }

        StringBuilder stringBuilder = new StringBuilder("");
        Node<E> tempNode = first;

        for (int i = 0; i < size; i++) {
            stringBuilder.append(tempNode.item).append(", ");
            tempNode = tempNode.next;
        }
        return "[" + stringBuilder.substring(0, stringBuilder.length()-2) + "]";

    }

    static class Node<E> {

        private E item;
        private Node<E> prev;
        private Node<E> next;

        public Node(E item, Node<E> prev, Node<E> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }
}
