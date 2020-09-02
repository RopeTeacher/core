package create.simpleFactory;

/**
 * @Author rope
 * @Date 2020/9/1 10:23
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
    }
}
