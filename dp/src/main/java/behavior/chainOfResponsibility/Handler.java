package behavior.chainOfResponsibility;

/**
 * @Author rope
 * @Date 2020/9/4 21:29
 * @Version 1.0
 */
/*
* 责任链模式
* 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系
* 将这些对象连成一条链，并沿着这条链发送请求，直到有一个对象处理他为止
*
* Handler：定义处理请求的接口，并且实现后继链(successor)
* */
public abstract class Handler {
    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    protected abstract void handleRequest(Request request);
}
