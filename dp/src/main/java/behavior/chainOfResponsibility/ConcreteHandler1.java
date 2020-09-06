package behavior.chainOfResponsibility;

/**
 * @Author rope
 * @Date 2020/9/4 21:37
 * @Version 1.0
 */
public class ConcreteHandler1 extends Handler{


    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if(request.getType() == RequestType.TYPE1){
            System.out.println(request.getName() + " is handle by ConcreteHandler1");
        }
        if(successor != null) {
            successor.handleRequest(request);
        }
    }
}
