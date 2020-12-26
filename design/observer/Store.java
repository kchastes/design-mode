package design.observer;

import java.util.ArrayList;
import java.util.List;
/**
 * @author KChaste Sun
 */
public class Store {

    private List<ProductSubscriber> list = new ArrayList<>();

    public void addSubscriber(ProductSubscriber subscriber){
        list.add(subscriber);
    }
    public void removeSubscriber(ProductSubscriber subscriber){
        list.remove(subscriber);
    }
    public void notifySubscriber(String message){
        for (ProductSubscriber subscriber : list){
            subscriber.update(message);
        }
    }
}
