package abstractFactory;

/**
 * @Author rope
 * @Date 2020/9/1 11:17
 * @Version 1.0
 */
public class ConcertFacrory1 extends AbstractFactory{
    AbstractProductA createA() {
        return new ProductA1();
    }

    AbstractProductB createB() {
        return new ProductB1();
    }
}
