package design.state;

public class AngryState implements State{

    private Mammoth mammoth;

    public AngryState(Mammoth mammoth){
        this.mammoth = mammoth;
    }

    @Override
    public void observe() {
        System.out.println("mammoth is angry state");
    }

    @Override
    public void onEnterState() {
        System.out.println("state modify");
    }
}
