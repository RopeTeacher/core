package behavior.chainOfResponsibility;

import jdk.nashorn.internal.objects.NativeUint8Array;

/**
 * @Author rope
 * @Date 2020/9/4 21:39
 * @Version 1.0
 */
public class ConcreteHandler2 extends Handler{

    public ConcreteHandler2(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE2){
            System.out.println(request.getName() + " is handle by ConcreteHandler2");
        }
        if(successor != null){
            successor.handleRequest(request);
        }
    }
}
