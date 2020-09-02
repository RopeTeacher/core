package com.genericity.day2;

import java.lang.reflect.Field;

/**
 * @Author rope
 * @Date 2020/8/31 19:05
 * @Version 1.0
 */
//无限制类型擦除
public class ErasureUser {
    public static void main(String[] args) {
        Erasure<Integer> erasure = new Erasure();
        Class<? extends Erasure> clz = erasure.getClass();
        Field[] declaredFields = clz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName()+":"+declaredField.getType().getSimpleName());
        }
    }
}
