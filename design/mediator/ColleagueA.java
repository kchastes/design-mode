package design.mediator;
/**
 * @author KChaste Sun
 */
public class ColleagueA extends Colleague{


    public ColleagueA(String name, Mediator mediator) {
        super(name, mediator);
    }
    public void getNotice(String message){
        System.out.println("同事A"+name+"获得信息"+message);
    }
    //同事A与中介者通信
    public void contact(String message){
        mediator.notice(message, this);
    }
}
