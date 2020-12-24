package design.chain;


/**
 * @author KChaste Sun
 */
public class DisposeHandler extends Handler{
    @Override
    void handleRequest(String request) {
        if (request.equals("aa")){
            System.out.println("DisposeHandler invoke");
        }else{
            if (getNext()!=null){
                getNext().handleRequest(request);
            }else{
                System.out.println("no invoke");
            }
        }
    }
}
