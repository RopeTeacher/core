package create.singleton;

/**
 * @Author rope
 * @Date 2020/8/31 19:20
 * @Version 1.0
 */
/*
* 单例模式：确保一个类只有一个实例，并提供该实例的全局访问点
* 懒汉式创建:私有静态变量被延迟实例化(好处:如果未用到该类，就不会实例化)
* 弊端:多线程的情况下不安全(多个线程到达的时候 singLetonLazy为空 会创建多个实例)
* */
public class Singleton_lazy {
    private static Singleton_lazy singletonLazy;

    private Singleton_lazy() {
    }

    public Singleton_lazy getSingletonLazy(){
        if(singletonLazy == null){
            singletonLazy = new Singleton_lazy();
        }
        return singletonLazy;
    }
}
