package com.genericity.day1;

/**
 * @Author rope
 * @Date 2020/8/30 20:42
 * @Version 1.0
 */
public class GenericityUser {
    public static void main(String[] args) {

        Genericity<String> genericity1 = new Genericity<String>("abc");
        System.out.printf(genericity1.getKey());

    }
}
