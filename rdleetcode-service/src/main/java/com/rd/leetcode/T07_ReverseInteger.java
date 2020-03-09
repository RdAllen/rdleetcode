/**
 * Alibaba.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */

package com.rd.leetcode;

/**
 * @author 邳彤
 * @version : T07_ReverseInteger, v 0.1 2020-03-09 邳彤  Exp $
 * @Description todo
 */
public class T07_ReverseInteger {

    public static void main(String[] args) {

    }

    public static int reverseInteger(int x) {
        long res = 0;

        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) res;
    }

}
