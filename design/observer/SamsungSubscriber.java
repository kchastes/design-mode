package design.observer;
/**
 * @author KChaste Sun
 */
public class SamsungSubscriber implements ProductSubscriber{
    @Override
    public void update(String message) {
        System.out.println("samsung subscriber receive message:"+message);
    }
}
