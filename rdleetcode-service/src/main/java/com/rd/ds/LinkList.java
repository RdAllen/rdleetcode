/**
 * Alibaba.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */

package com.rd.ds;

/**
 * @author 邳彤
 * @version : linklist, v 0.1 2020-03-08 邳彤  Exp $
 * @Description todo
 */
public class LinkList<E> implements Collection<E> {

    transient int size = 0;

    transient Node<E> first;

    public static void main(String[] args) {
        LinkList<People> linkList = new LinkList<>();

        People p1 = new People(1, "p1");
        linkList.add(0,p1);

        People p2 = new People(1, "p2");
        linkList.add(1,p2);


    }

    private static class Node<E> {
        E       item;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;

        }
    }

    private Node<E> linkNode(int index) {
        rangeCheck(index);
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private void rangeCheck(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("IlleagArugmengts");
        }
    }

    @Override
    public boolean add(int index, E e) {

        if (index == 0) {
            first = new Node<>(e, first);
            size++;
            return true;
        }

        Node<E> pre = linkNode(index - 1);
        pre.next = new Node<>(e, pre.next);
        size++;

        return true;
    }

    @Override
    public boolean remove(int index) {
        if (index == 0) {
            first = first.next;
            size--;
            return true;
        }

        Node<E> pre = linkNode(index - 1);
        pre.next = pre.next.next;
        size--;

        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean add(E e) {

        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public E get() {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }

    private static class People {

        People(int age, String name) {
            this.age = age;
            this.name = name;
        }

        private int    age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
