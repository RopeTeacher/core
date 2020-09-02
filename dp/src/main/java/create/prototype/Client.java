package create.prototype;

/**
 * @Author rope
 * @Date 2020/9/2 16:00
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("abc");
        Prototype clone = prototype.myclone();
        System.out.println(clone.toString());
    }
}
