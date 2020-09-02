package com.genericity.day2;

import java.util.ArrayList;

/**
 * @Author rope
 * @Date 2020/8/31 18:59
 * @Version 1.0
 */
//此类用于简单展示泛型擦除
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<String> strList = new ArrayList<String>();
        String simpleName1 = intList.getClass().getSimpleName();
        String simpleName2 = strList.getClass().getSimpleName();
        System.out.println(simpleName1+" "+simpleName2);
    }
}
