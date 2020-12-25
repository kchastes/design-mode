package design.mediator;
/**
 * @author KChaste Sun
 */
public class ConcreteMediator extends Mediator{
    private ColleagueA colleagueA;
    private ColleagueB colleagueB;


    @Override
    public void notice(String content, Colleague coll) {
        if (coll == colleagueA){
            colleagueB.getNotice(content);
        }else{
            colleagueA.getNotice(content);
        }
    }

    public ColleagueA getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public ColleagueB getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
