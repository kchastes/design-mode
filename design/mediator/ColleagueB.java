package design.mediator;
/**
 * @author KChaste Sun
 */
public class ColleagueB extends Colleague{


    public ColleagueB(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void getNotice(String message){
        System.out.println("同事B"+name+"获得信息"+message);
    }

    //同事B与中介者通信
    public void contact(String message){
        mediator.notice(message, this);
    }
}
