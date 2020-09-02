package create.prototype;

/**
 * @Author rope
 * @Date 2020/9/2 15:55
 * @Version 1.0
 */
/*
* 使用原型实例指定要创建对象的类型，通过复制这个原型来创建新对象
*
* 参考：java.lang.Object clone()
* */
public abstract class Prototype {
    abstract Prototype myclone();
}
