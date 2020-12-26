package design.observer;

/**
 * @author KChaste Sun
 */
public class AppleSubscriber implements ProductSubscriber{
    @Override
    public void update(String message) {
        System.out.println("apple subscriber receive message :"+message);
    }
}
