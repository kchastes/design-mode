package design.iterator;

/**
 * @author KChaste Sun
 */
public interface Aggregate {

    /**
     * add element
     * @param obj element
     */
     void add(Object obj);

    /**
     * remove element
     * @param obj element
     */
     void remove(Object obj);

    /**
     * get iterator
     * @return iterator instance
     */
     Iterator getIterator();

}
