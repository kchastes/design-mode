package design.mediator;
/**
 * @author KChaste Sun
 */
public class MediatorTest {

    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ColleagueA a = new ColleagueA("A",concreteMediator);
        ColleagueB b = new ColleagueB("B",concreteMediator);
        concreteMediator.setColleagueA(a);
        concreteMediator.setColleagueB(b);
        a.contact("hhh");
    }

}
