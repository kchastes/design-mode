package design.iterator;

public class IteratorTest {


    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("one");
        ag.add("two");
        ag.add("three");
        Iterator it = ag.getIterator();
        while (it.hasNext()) {
            Object ob = it.next();
            System.out.print(ob.toString() + "\t");
        }
        Object ob = it.first();
        System.out.println("\nFirst：" + ob.toString());
    }

}
