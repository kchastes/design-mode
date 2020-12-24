package design.chain;

/**
 * @author KChaste Sun
 */
public abstract class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }
    public Handler getNext() {
        return next;
    }

    /**
     * invoke request
     * @param request info
     */
    abstract void handleRequest(String request);



}
