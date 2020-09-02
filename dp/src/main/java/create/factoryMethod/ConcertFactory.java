package create.factoryMethod;

/**
 * @Author rope
 * @Date 2020/9/1 10:42
 * @Version 1.0
 */
public class ConcertFactory extends Factory{
    public Product factoryMethod() {
        return new ConcertProduct();
    }
}
