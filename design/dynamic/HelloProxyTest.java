package design.dynamic;

import java.lang.reflect.Proxy;

public class HelloProxyTest {

    public static void main(String[] args) {
        TomHello tomHello = new TomHello();
        Hello o = (Hello)Proxy.newProxyInstance(HelloProxyTest.class.getClassLoader(), new Class[]{Hello.class}, (a, b, c) -> {
            System.out.println("Tom weak up");
            Object invoke = b.invoke(tomHello, c);
            System.out.println("Tom deal");
            return invoke;
        });
        o.print();


    }


}
