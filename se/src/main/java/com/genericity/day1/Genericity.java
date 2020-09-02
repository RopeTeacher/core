package com.genericity.day1;

/**
 * @Author rope
 * @Date 2020/8/30 20:41
 * @Version 1.0
 */
//this is a genericity class
public class Genericity<T> {

    private T key;

    public Genericity(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Genericity{" +
                "key=" + key +
                '}';
    }
}
