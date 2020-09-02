package abstractFactory;

/**
 * @Author rope
 * @Date 2020/9/1 11:20
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcertFacrory1();
        AbstractProductA a = abstractFactory.createA();
        AbstractProductB b = abstractFactory.createB();
    }
}
