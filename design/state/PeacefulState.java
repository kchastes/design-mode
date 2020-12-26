package design.state;

public class PeacefulState implements State{
    private Mammoth mammoth;

    public PeacefulState(Mammoth mammoth){
        this.mammoth = mammoth;
    }

    @Override
    public void observe() {
        System.out.println("is calm and peaceful");
    }

    @Override
    public void onEnterState() {
        System.out.println("state modify");
    }
}
