package com.list;

import java.util.Arrays;

public class MyLinkedList<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;


    public MyLinkedList() {

        this(null);
        this.size = 0;

    }

    public MyLinkedList(E value) {

        this.first = new Node<E>(value, null, null);
        this.size = 1;
    }

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


    public void clear() {
        size = 0;
        first = last = null;
    }

    public int size() {
        return size;
    }

    public E get(int index) {

        if (index == size - 1) return last.item;

        Node<E> tempNode = first;

        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        return tempNode.item;
    }

    @Override
    public String toString() {

        String resultStr = "";
        Node<E> tempNode = first;

        for (int i = 0; i < size; i++) {
            resultStr += tempNode.item + ", ";
            tempNode = tempNode.next;
        }
        return "[" + resultStr.substring(0, resultStr.length() - 2) + "]";
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
