package design.iterator;

import java.util.ArrayList;
import java.util.List;
/**
 * @author KChaste Sun
 */
public class ConcreteAggregate implements Aggregate{
    private List<Object> list = new ArrayList<Object>();
    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
