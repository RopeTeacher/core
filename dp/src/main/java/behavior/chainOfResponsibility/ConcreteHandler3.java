package behavior.chainOfResponsibility;

/**
 * @Author rope
 * @Date 2020/9/6 20:38
 * @Version 1.0
 */
public class ConcreteHandler3 extends Handler{


    public ConcreteHandler3(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if(request.getType() == RequestType.TYPE3){
            System.out.println(request.getName() + " is handle by ConcreteHandler2");
            return;
        }

        if(successor != null){
            successor.handleRequest(request);
        }
    }
}
