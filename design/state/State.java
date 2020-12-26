package design.state;
/**
 * @author KChaste Sun
 */
public interface State {

    /**
     * observe state
     */
    void observe();

    /**
     * invoke function
     */
    void onEnterState();


}
