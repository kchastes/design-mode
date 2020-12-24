package design.adapter;

/**
 * @author KChaste Sun
 */
public class TrainAdapter implements Aircraft {

    private Train train;

    public TrainAdapter(){
        this.train = new Train();
    }

    public TrainAdapter(Train train) {
        this.train = train;
    }
    @Override
    public void plane() {
        train.action();
    }
}
