package com.map;

import com.collection.Map;

public class MyHashMap<K, V> implements Map<K, V> {

    private int size;
    private Node<K, V> curent;


    public MyHashMap() {
        this(null, null);
        this.size = 0;
    }

    public MyHashMap(K key, V value) {
        this.curent = new Node<K, V>(key, value, null);
        this.size = 1;
    }


    @Override
    public void put(K key, V value) {
        if (size == 0) {
            curent = new Node<>(key, value, null);
            size++;
        } else {
            Node<K, V> temp = curent;
            for (int i = 1; i < size; i++) {
                temp = temp.next;
            }
            temp.next = new Node<>(key, value, null);
        }
    }

    @Override
    public void remove(K key) {

        Node<K, V> prev = null;
        Node<K, V> temp = curent;

        for (int i = 0; i < size; i++) {
            if (temp.key == key && i == 0) {
                curent = temp.next;
                return;
            } else {
                if (temp.key == key) {
                    prev.next = temp.next;
                } else {
                    prev = temp;
                    temp = temp.next;
                }
            }
        }

    }


    @Override
    public void clear() {
        size = 0;
        curent = null;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public V get(K key) {

        Node<K, V> tempNode = curent;

        for (int i = 0; i < size; i++) {
            if (tempNode.key == key) {
                return tempNode.value;
            } else {
                tempNode = tempNode.next;
            }
        }
        return tempNode.value;
    }


    @Override
    public String toString() {

        if (size == 0) {
            return "";
        }

StringBuilder stringBuilder = new StringBuilder();
        Node<K, V> tempNode = curent;

        for (int i = 0; i < size; i++) {
            stringBuilder.append(tempNode.value).append(", ");
            tempNode = tempNode.next;
        }
        return "[" + stringBuilder.substring(0, stringBuilder.length() - 2) + "]";

    }

    static class Node<K, V> {

        private K key;
        private V value;

        private Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
