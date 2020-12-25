package design.iterator;

/**
 * @author KChaste Sun
 */
public interface Iterator {
    /**
     * get first element
     * @return first element
     */
    Object first();

    /**
     * next element
     * @return next element
     */
    Object next();

    /**
     * whether have exists element
     * @return true or false
     */
    boolean hasNext();
}
