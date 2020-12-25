package design.memo;

/**
 * @author KChaste Sun
 */
public class Caretaker {

    private Memento memento;
    public void setMemento(Memento m) {
        memento = m;
    }
    public Memento getMemento() {
        return memento;
    }

}
