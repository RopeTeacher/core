package create.simpleFactory;

/**
 * @Author rope
 * @Date 2020/9/1 10:15
 * @Version 1.0
 */
/*
* 简单工厂模式：创建一个对象时不向客户暴露内部细节，并提供一个创建对象的通用接口
*
* 简单工厂把实例化的操作单独放到一个类中，这个类就成为简单工厂类，让简单工厂类来决定用哪个具体子类来实例化
*
* 好处：能够把客户类和具体子类的实现解耦
* */
public interface Product {
}
