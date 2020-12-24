package design.flyweight;

import java.util.HashMap;

/**
 *
 * flyweight get instance
 *
 * @author KChaste Sun
 */
public class FlyweightFactory {

    private HashMap<String, IFlyweight> flyweights = new HashMap<String, IFlyweight>();
    public IFlyweight getFlyweight(String key) {
        IFlyweight flyweight =flyweights.get(key);
        if (flyweight != null) {
            System.out.println("key existed,return");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }

}
