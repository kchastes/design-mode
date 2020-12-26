package design.observer;
/**
 * @author KChaste Sun
 */
public class ObserverTest {

    public static void main(String[] args) {
        Store store = new Store();

        store.addSubscriber(new AppleSubscriber());
        store.addSubscriber(new SamsungSubscriber());
        store.notifySubscriber("have new product!!!!");
    }

}
