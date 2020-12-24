package design.decorate;

/**
 *<p>Add responsibilities to individual objects dynamically and
 *transparently,that is, <strong>without affecting other objects.</strong>
 *</p>
 * <p>
 *  Reduce subclasses combination of the same type
 * </p>
 *
 * @author KChaste Sun
 */
public class NotifyDecorate implements Notify{

    private Notify notify;

    public NotifyDecorate(Notify notify){
        this.notify = notify;
    }

    @Override
    public void send(String message) {
        notify.send(message);
        System.out.println("send twitter message...");
        System.out.println("more message channel...");
    }
}
