package factoryMethod;

/**
 * @Author rope
 * @Date 2020/9/1 10:50
 * @Version 1.0
 */
public class ConcertFactory1 {
    public Product factoryMethod() {
        return new ConcertProduct1();
    }
}
