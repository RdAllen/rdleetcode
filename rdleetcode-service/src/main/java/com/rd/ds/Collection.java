/**
 * Alibaba.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */

package com.rd.ds;

/**
 * @author 邳彤
 * @version : Collection, v 0.1 2020-03-08 邳彤  Exp $
 * @Description todo
 */
public interface Collection<E> {

    int size();

    boolean isEmpty();

    E get();

    boolean contains(Object o);

    boolean add(int index ,E e);


    boolean remove(int index);

    boolean add(E e);

    boolean remove(Object o);

    void clear();

    boolean equals(Object o);

    int hashCode();
}
