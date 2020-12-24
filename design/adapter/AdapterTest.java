package design.adapter;

/**
 *
 * @see java.util.Collections#enumeration
 * @see java.util.Collections#list
 * @see java.util.Arrays#asList
 * @author KChaste Sun
 */
public class AdapterTest {

    public static void main(String[] args) {
        Driver driver = new Driver(new TrainAdapter());
        driver.work();
    }

}
