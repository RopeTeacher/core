package com.genericity.day1;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author rope
 * @Date 2020/8/30 20:57
 * @Version 1.0
 */
public class ProductGetter<T> {

    Random random = new Random();

    //奖品可以是钱 也可以是货品
    private T product;
    //定义一个奖品列表
    ArrayList<T> productList = new ArrayList<T>();

    //增加奖品
    public void addProduct(T t){
        productList.add(t);
    }
    //抽奖(即随机获取一个货品)
    public T getProduct(){
        return productList.get(random.nextInt(productList.size()));
    }

}
