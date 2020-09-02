package simpleFactory;

/**
 * @Author rope
 * @Date 2020/9/1 10:21
 * @Version 1.0
 */
public class SimpleFactory {

    public Product createProduct(int type){
        if(type == 1){
            return new ConcertProduct1();
        }else if(type == 2){
            return new ConcertProduct2();
        }
        return new ConcertProduct();
    }
}
