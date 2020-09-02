package create.builder;

/**
 * @Author rope
 * @Date 2020/9/1 21:41
 * @Version 1.0
 */
public class StringBuilder extends AbstractStringBuilder{
    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString(){
        return new String(value,0,count);
    }
}
