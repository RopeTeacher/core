package com.genericity.day1;

/**
 * @Author rope
 * @Date 2020/8/31 1:39
 * @Version 1.0
 */
public class ProductGetterUser {
    public static void main(String[] args) {
        //创建抽奖器对象 指定类型
        ProductGetter<String> stringProductGetter = new ProductGetter<String>();
        //给抽奖器填充奖品
        String[] setProducts = {"苹果手机","华为平板","扫地机器人","咖啡机"};
        for (String setProduct: setProducts) {
            stringProductGetter.addProduct(setProduct);
        }
        //抽奖
        String product = stringProductGetter.getProduct();
        System.out.println(product);

        ProductGetter<Integer> intProductGetter = new ProductGetter<Integer>();
        int[] intProducts = {100,500,2000,10000};
        for (int intProduct: intProducts) {
            intProductGetter.addProduct(intProduct);
        }
        //抽奖
        int product1 = intProductGetter.getProduct();
        System.out.println(product1);

    }
}
