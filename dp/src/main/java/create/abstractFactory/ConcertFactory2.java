package create.abstractFactory;

/**
 * @Author rope
 * @Date 2020/9/1 11:19
 * @Version 1.0
 */
public class ConcertFactory2 extends AbstractFactory{
    AbstractProductA createA() {
        return new ProductA2();
    }

    AbstractProductB createB() {
        return new ProductB2();
    }
}
