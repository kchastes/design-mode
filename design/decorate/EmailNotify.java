package design.decorate;

/**
 * Send email message
 *
 * @author KChaste Sun
 */
public class EmailNotify implements Notify{

    @Override
    public void send(String message) {
        System.out.println("email send:"+message);
    }

}
