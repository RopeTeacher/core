package create.singleton;

/**
 * @Author rope
 * @Date 2020/8/31 19:41
 * @Version 1.0
 */
public class Singleton_lazy_double {
    private volatile Singleton_lazy_double singletonLazyDouble;

    private Singleton_lazy_double() {
    }

    public Singleton_lazy_double getSingletonLazyDouble(){
        if(singletonLazyDouble == null){
            synchronized (Singleton_lazy_double.class){
                if(singletonLazyDouble == null){
                    singletonLazyDouble = new Singleton_lazy_double();
                }
            }
        }
        return singletonLazyDouble;
    }
}
