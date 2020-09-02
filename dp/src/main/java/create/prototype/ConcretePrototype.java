package create.prototype;

/**
 * @Author rope
 * @Date 2020/9/2 15:58
 * @Version 1.0
 */
public class ConcretePrototype extends Prototype{

    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    @Override
    Prototype myclone() {
        return new ConcretePrototype(field);
    }

    @Override
    public String toString(){
        return field;
    }

}
