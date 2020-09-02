package create.singleton;

/**
 * @Author rope
 * @Date 2020/8/31 19:29
 * @Version 1.0
 */
public class Singleton_hungry {
    private static Singleton_hungry singletonHungry = new Singleton_hungry();

    private Singleton_hungry() {
    }

    public Singleton_hungry getSingletonHungry(){
        return singletonHungry;
    }
}
