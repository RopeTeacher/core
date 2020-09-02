package com.genericity.day2;

/**
 * @Author rope
 * @Date 2020/8/31 19:04
 * @Version 1.0
 */
public class Erasure<T> {
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}
