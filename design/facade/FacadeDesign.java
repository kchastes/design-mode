package design.facade;

/**
 * @author KChaste Sun
 */
public class FacadeDesign {
    public static void main(String[] args) {
        Facade f = new Facade();
        f.method();
    }
}

class Facade {
    private final SubSystem01 obj1 = new SubSystem01();
    private final SubSystem02 obj2 = new SubSystem02();
    private final SubSystem03 obj3 = new SubSystem03();

    public void method() {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}

class SubSystem01 {
    public void method1() {
        System.out.println("system one.....");
    }
}

class SubSystem02 {
    public void method2() {
        System.out.println("system two...");
    }
}

class SubSystem03 {
    public void method3() {
        System.out.println("system three.....");
    }
}