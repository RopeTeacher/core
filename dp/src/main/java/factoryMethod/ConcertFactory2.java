package factoryMethod;

/**
 * @Author rope
 * @Date 2020/9/1 10:51
 * @Version 1.0
 */
public class ConcertFactory2 {
    public Product factoryMethod() {
        return new ConcertProduct2();
    }
}
